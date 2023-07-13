package Model;

public class PhoneNumber {
    final private String myAreaCode;
    final private String myNumber;

    public PhoneNumber(final String theAreaCode, final String theNumber) {
        myAreaCode = theAreaCode;
        myNumber = theNumber;
    }

    public String toString() {
        return "(" + myAreaCode + ")"
                + myNumber.substring(0,3)
                + "-"
                + myNumber.substring(3);
    }
}
