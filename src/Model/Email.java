package Model;

public class Email {
    final private String myHandle;
    final private String myDomain;
    final private String myTag;

    public Email(final String theHandle, final String theDomain, final String theTag) {
        myHandle = theHandle;
        myDomain = theDomain;
        myTag = theTag;
    }

    public String toString() {
        return myHandle + "@" + myDomain + "." + myTag;
    }
}
