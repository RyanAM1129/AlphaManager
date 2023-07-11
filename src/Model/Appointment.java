package Model;

import java.util.Date;

public class Appointment {
    final private Date myDate;
    final private Pet myPet;
    final private Time myTime;

    public Appointment(final Date theDate, final Pet thePet, final Time theTime) {
        myDate = theDate;
        myPet = thePet;
        myTime = theTime;
    }

    public Date getDate() {
        return myDate;
    }

    public Pet getPet() {
        return myPet;
    }

    public Time getTime() {
        return myTime;
    }
}
