package Controller;

import Model.Email;
import Model.PhoneNumber;

public class Converter {
    public static Email stringToEmail(final String theString) {
        String theHandle;
        String theDomain;
        String theTag;
        String[] theArray;

        theArray = theString.split("@");
        theHandle = theArray[0];
        theArray = theArray[1].split("\\.");
        theDomain = theArray[0];
        theTag = theArray[1];

        return new Email(theHandle, theDomain, theTag);
    }

    public static PhoneNumber stringToPhoneNumber(final String theString) {
        StringBuilder thePhoneNumber = new StringBuilder();

        for(char character : theString.toCharArray()) {
            if(character != '(' | character != ')' | character != '-') {
                thePhoneNumber.append(character);
            }
        }
        return new PhoneNumber(thePhoneNumber.toString().substring(0, 3), thePhoneNumber.substring(3));
    }
}
