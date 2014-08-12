package training.ideas.java.decisions;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnkiw on 24-07-2014.
 */
public class FPLOSTest {

    @Test
    public void checkFPLOS()
    {
        double[] dblLrv={98,117,0,100,37,1,88};
        double rate = 90.00;
        Assert.assertEquals("NNYYYYY",FPLOSCalculator.generateFPLOS(rate, dblLrv));
    }
    @Test
    public void checkFPLOS_Small_LRV()
    {
        double[] dblLrv={85,89,0,49,37,1,78};
        double rate = 90.00;
        Assert.assertEquals("YYYYYYY",FPLOSCalculator.generateFPLOS(rate, dblLrv));
    }
    @Test
    public void checkFPLOS_Higher_LRV()
    {
        double[] dblLrv={98,117,0,100,37,1,88};
        double[] rate = {90.00,90,90,90};
        String[]Spectrum={"NNYYYYY","NNYYYYY","NNYYYYY","NNYYYYY"};
        Assert.assertArrayEquals(Spectrum,FPLOSCalculator.generateFPLOS(rate, dblLrv));
    }




}
