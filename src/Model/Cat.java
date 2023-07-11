package Model;

import java.util.Date;

public class Cat extends Pet{
    private CatBreed myBreed;

    public Cat(final CatBreed theBreed, final String theName, final Date theBirthDate,
               final float theWeight, final boolean theMicroChipped) {
        super(theName, theBirthDate, theWeight, theMicroChipped);
        myBreed = theBreed;
    }

    public CatBreed getBreed() {
        return myBreed;
    }

    public void setBreed(final CatBreed theBreed) {
        myBreed = theBreed;
    }
}
