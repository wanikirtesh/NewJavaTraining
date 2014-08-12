package training.ideas.java.utills;

import org.junit.Assert;
import org.junit.Test;

/**
 * ****************************
 * Created by idnkiw on 06-08-2014.
 * *****************************
 */
public class FibonacciTest {
    @Test
    public void test_first_2_fibonacci_number()
    {
        int[] expected ={0,1};
        Assert.assertArrayEquals(expected,Fibonacci.getSeries(2));
    }

    @Test
    public void test_first_5_fibonacci_number()
    {
        int[] expected ={0,1,1,2,3};
        Assert.assertArrayEquals(expected,Fibonacci.getSeries(5));
    }

    @Test
    public void test_first_0_fibonacci_number()
    {
        int[] expected ={};
        Assert.assertArrayEquals(expected,Fibonacci.getSeries(0));
    }

    @Test
    public void test_first_1_fibonacci_number()
    {
        int[] expected ={0};
        Assert.assertArrayEquals(expected,Fibonacci.getSeries(1));
    }


    @Test
    public void test_first_5_fibonacci_rec_number()
    {
        int[] expected ={0,1,1,2,3,5,8};
        Assert.assertArrayEquals(expected,Fibonacci.getRecursive(7));
    }

}
