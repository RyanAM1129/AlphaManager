package Controller;

import Model.Email;
import Model.PhoneNumber;

import java.util.Scanner;
import java.util.regex.*;

public class Validator {
    final static private Scanner myInput = new Scanner(System.in);

    public static int getInt(final int min, final int max) {
        int theCheck;
        if(myInput.hasNextInt()) {
            theCheck = myInput.nextInt();
            myInput.nextLine();   //Cleans the Scanner for the next input
            if(theCheck >= min && theCheck <= max) {
                return theCheck;
            } else {
                System.out.println("That choice does not exist...");
            }
        } else {
            myInput.next();
            System.out.println("You did not enter a number...");
        }
        return getInt(min, max);
    }

    public static String getClientName() {
        Pattern namePattern = Pattern.compile("^[A-z]+( ([A-z]\\.|[A-z]+))? [A-z]+-?[A-z]*$");
        String theCheck = myInput.nextLine();
        Matcher theMatcher = namePattern.matcher(theCheck);

        if(theMatcher.find()) {
            return theCheck;
        }
        System.out.println("Please enter a properly formatted name...\n>");
        return getClientName();
    }

    public static Email getEmail() {
        Pattern theEmailPattern = Pattern.compile("^\\w+@\\w+.(com|gov|edu|net)$");
        String theCheck = myInput.nextLine();
        Matcher theMatcher = theEmailPattern.matcher(theCheck);

        if(theMatcher.find()) {
            return Converter.stringToEmail(theCheck);
        }
        System.out.println("Please enter a properly formatted email...\n>");
        return getEmail();
    }

    public static PhoneNumber getPhoneNumber() {
        Pattern thePhoneNumberPattern = Pattern.compile("^(\\(\\d{3}\\)|\\d{3})(\\d{7}|\\d{3}-\\d{4})$");
        String theCheck = myInput.nextLine();
        Matcher theMatcher = thePhoneNumberPattern.matcher(theCheck);

        if(theMatcher.find()) {
            return Converter.stringToPhoneNumber(theCheck);
        }
        System.out.println("Please enter a properly formatted phone number...");
        return getPhoneNumber();
    }

    public static void closeScanner() {
        myInput.close();
    }

    public static String getPetName() {
        Pattern namePattern = Pattern.compile("^[A-z.]+( [A-z]+)*$");
        String theCheck = myInput.nextLine();
        Matcher theMatcher = namePattern.matcher(theCheck);

        if(theMatcher.find()) {
            return theCheck;
        }
        System.out.println("Please enter a properly formatted name...\n>");
        return getClientName();
    }
}
