package Controller;

import java.util.Scanner;

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
            System.out.println("You did not enter a number...");
        }
        return getInt(min, max);
    }
}
