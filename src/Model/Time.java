package Model;

public class Time {
    private int myHour;
    private int myMinute;

    public Time(final int theHour, final int theMinute) {
        myHour = theHour;
        myMinute = theMinute;
    }

    public String toString() {
        return myHour + ":" + myMinute;
    }
}
