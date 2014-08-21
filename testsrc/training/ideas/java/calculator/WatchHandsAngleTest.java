package training.ideas.java.calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * ****************************
 * Created by idnkiw on 11-08-2014.
 * *****************************
 */
public class WatchHandsAngleTest {

   @Test
   public void find_angle_when_time_is_1_30()
   {
       Assert.assertEquals(135.0,WatchAngle.findAngle(1,30),1);
   }

    @Test
    public void find_angle_when_time_is_12_15()
    {
        Assert.assertEquals(82.5,WatchAngle.findAngle(12,15),1);
    }
    @Test
    public void find_angle_when_time_is_12_40()
    {
        Assert.assertEquals(220.0,WatchAngle.findAngle(12,40),1);
    }
    @Test
    public void find_angle_when_time_is_3_15()
    {
        Assert.assertEquals(352.5,WatchAngle.findAngle(3,15),1);
    }

    @Test
    public void find_angle_when_time_is_7_30()
    {
        Assert.assertEquals(315.0,WatchAngle.findAngle(7,30),1);
    }


}
