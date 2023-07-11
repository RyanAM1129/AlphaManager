package Model;

public class Email {
    final private String myHandle;
    final private String myDomain;

    public Email(final String theHandle, final String theDomain) {
        myHandle = theHandle;
        myDomain = theDomain;
    }

    public String toString() {
        return myHandle + "@" + myDomain;
    }
}
