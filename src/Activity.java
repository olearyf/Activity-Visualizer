import java.awt.*;

public class Activity {

    private int day, year;
    private double miles;

    public Activity(int d, int y){
        day = d;
        year = y;
        miles = 0;//strava method to get data using day, year, etc;
    }
    public Color getActivity(){
        return Color.BLACK;

    }
}
