public class Verhicle {
    int numbers;
    String names;
    int maxspeed;

    Verhicle(int myNumber , String myName , int myMaxspeed) {
        numbers = myNumber;
        names = myName;
        maxspeed = myMaxspeed;

    }

    public String toString() {
        return numbers + " - " + names + " - " + maxspeed;
                

    }
}
