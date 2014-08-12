package training.ideas.java.calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by idnkiw on 22-07-2014.
 */
public class CalculatorTest {
    @Test
    public void addition_of_integer()
    {
        Assert.assertEquals(2 + 3, Calculator.performAdd(2, 3),0);
    }

    @Test
    public void addition_of_n_Numbers()
    {
        Assert.assertEquals(1+2+3+4+5+6+7+8+9,Calculator.performAdd(1,2, 3, 4, 5, 6, 7, 8, 9),0);
    }

    @Test
     public void addition_of_Array()
    {
        double[] array =  {2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertEquals(2 + 3 + 4 + 5 + 6 + 7 + 8 + 9, Calculator.performAdd(array),0);
    }

    @Test
    public void addition_of_doubles()
    {
        Assert.assertEquals(2.4+3.7,Calculator.performAdd(2.4, 3.7),1);
    }


}
