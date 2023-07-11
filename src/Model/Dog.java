package Model;

import java.util.Date;

public class Dog extends Pet{
    private DogBreed myBreed;

    public Dog(final DogBreed theBreed, final String theName, final Date theBirthDate,
               final float theWeight, final boolean theMicroChipped) {
        super(theName, theBirthDate, theWeight, theMicroChipped);
        myBreed = theBreed;
    }

    public DogBreed getBreed() {
        return myBreed;
    }

    public void setBreed(final DogBreed theBreed) {
        myBreed = theBreed;
    }
}
