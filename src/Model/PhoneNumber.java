package Model;

public class PhoneNumber {
    final private int myAreaCode;
    final private int myNumber;

    public PhoneNumber(final int theAreaCode, final int theNumber) {
        myAreaCode = theAreaCode;
        myNumber = theNumber;
    }

    public String toString() {
        return "(" + myAreaCode + ")" + myNumber;
    }
}
