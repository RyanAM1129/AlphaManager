package Controller;

import java.util.Scanner;
import java.util.regex.*;

public class Validator {
    final static private Scanner input = new Scanner(System.in);

    public static int getInt(final int min, final int max) {
        boolean moveOn = false;
        int check;

        System.out.println("Please enter a number between " + min + " and " + max + ":");
        if(input.hasNextInt()) {
            check = input.nextInt();
            if(check >= min && check <= max) {
                return check;
            } else {
                System.out.println("That choice does not exist...");
            }
        } else {
            input.next();
            System.out.println("You did not enter a number...");
        }
        return getInt(min, max);
    }

    public static String getName() {
        Pattern namePattern = Pattern.compile("[A-z]+( ([A-z]\\.|[A-z]+))? [A-z]+-?[A-z]*");
        input.next();   //Cleans the Scanner for the next input
        String check = input.nextLine();
        Matcher matcher = namePattern.matcher(check);

        if(!matcher.find()) {
            System.out.println("Please enter a properly formatted name...\n>");
            return getName();
        }
        return check;
    }

    public static void closeScanner() {
        input.close();
    }
}
