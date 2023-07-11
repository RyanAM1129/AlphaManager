package Model;

import java.util.Date;

public class Pet {
    private String myName;
    private Date myBirthDay;
    private float myWeight;
    private boolean myMicroChipped;

    private static int myID;

    public Pet(final String theName, final Date theBirthDate,
               final float theWeight, final boolean theMicroChipped) {
        myName = theName;
        myBirthDay = theBirthDate;
        myWeight = theWeight;
        myMicroChipped = theMicroChipped;
    }

    public String getName() {
        return myName;
    }

    public void setName(final String theName) {
        myName = theName;
    }

    public Date getBirthDay() {
        return myBirthDay;
    }

    public void setBirthDay(final Date theBirthDay) {
        myBirthDay = theBirthDay;
    }

    public float getWeight() {
        return myWeight;
    }

    public void setWeight(final float theWeight) {
        myWeight = theWeight;
    }

    public boolean getMicroChipped() {
        return myMicroChipped;
    }

    public void setMicroChipped(boolean theMicroChipped) {
        myMicroChipped = theMicroChipped;
    }
}
