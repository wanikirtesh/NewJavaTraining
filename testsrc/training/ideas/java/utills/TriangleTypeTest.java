package training.ideas.java.utills;

import org.junit.Test;
import org.junit.Assert;

/**
 * ****************************
 * Created by idnkiw on 14-08-2014.
 * *****************************
 */
public class TriangleTypeTest {
    @Test
    public void test_for_triangle_30_40_110() throws Exception
    {
        Assert.assertEquals(TriangleTypes.SCALENE,TriangleTypes.getTriangle(30,40,110));
    }
    @Test
    public void test_for_triangle_60_60_60() throws Exception
    {
        Assert.assertEquals(TriangleTypes.EQUILETERAL,TriangleTypes.getTriangle(60,60,60));
    }
    @Test(expected = NotATriangleException.class)
    public void test_for_triangle_60_70_60() throws Exception
    {
        Assert.assertEquals(TriangleTypes.SCALENE,TriangleTypes.getTriangle(60,70,60));
    }
    @Test(expected = NotATriangleException.class)
    public void test_for_triangle_0_90_90() throws Exception
    {
        Assert.assertEquals(TriangleTypes.SCALENE,TriangleTypes.getTriangle(0,90,90));
    }
    @Test
    public void test_for_triangle_60_90_30() throws Exception
    {
        Assert.assertEquals(TriangleTypes.ISOSCELES,TriangleTypes.getTriangle(90,45,45));
        Assert.assertEquals(true,TriangleTypes.RIGHTANGLE.is(90,45,45));
        Assert.assertEquals(true,TriangleTypes.ISOSCELES.is(90,45,45));
    }

}
