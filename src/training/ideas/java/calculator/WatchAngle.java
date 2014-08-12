package training.ideas.java.calculator;

/**
 * ****************************
 * Created by idnkiw on 11-08-2014.
 * *****************************
 */
public class WatchAngle {
    public static double findAngle(int hour, int minute) {
        double MinuteAngle = 6*minute;
        double HourAngle=(hour*30)+(30/(360/MinuteAngle));
        double angle = MinuteAngle-HourAngle;
        if(angle<0)
        {
            angle=  360+(MinuteAngle-HourAngle);
        }
        return angle;
    }
}
