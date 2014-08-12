package training.ideas.java.utills;

import org.junit.Assert;
import org.junit.Test;

/**
 * ****************************
 * Created by idnkiw on 12-08-2014.
 * *****************************
 */
public class AmmountRounderTest {
    @Test
    public void round_12_46_12_50()
    {
        Assert.assertEquals(12.50, AmountRounder.round(12.46), 2);
    }
    @Test
    public void round_00_46_00_50()
    {
        Assert.assertEquals(0.50, AmountRounder.round(0.46),2);
    }
}
