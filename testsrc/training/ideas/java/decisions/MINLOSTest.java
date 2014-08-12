package training.ideas.java.decisions;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnkiw on 24-07-2014.
 */
public class MINLOSTest {

    @Test
    public void find_minlos_fro_patter_NYYYYYY()
    {
        String strPatter = "NYYYYYY";
        Assert.assertEquals(2,MINLOSCalculator.generateMinlos(strPatter));
    }
    @Test
    public void find_minlos_fro_patter_YNYYYYY()
    {
        String strPatter = "YNYYYYY";
        Assert.assertEquals(1,MINLOSCalculator.generateMinlos(strPatter));
    }
    @Test
     public void find_minlos_fro_patter_NNNNNNN()
    {
        String strPatter = "NNNNNNN";
        Assert.assertEquals(0,MINLOSCalculator.generateMinlos(strPatter));
    }
    @Test
     public void find_minlos_fro_patter_NNNYYYY()
    {
        String strPatter = "NNNYYYY";
        Assert.assertEquals(4,MINLOSCalculator.generateMinlos(strPatter));
    }

}
