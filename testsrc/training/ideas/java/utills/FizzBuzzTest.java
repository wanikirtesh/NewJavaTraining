package training.ideas.java.utills;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * ****************************
 * Created by idnkiw on 11-08-2014.
 * *****************************
 */

public class FizzBuzzTest {
    @Test
    public void test_for_first_10_numbers()
    {
        String[] expected={"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz"};
        assertArrayEquals(expected,FizzBuzz.getnerateSeries(10));
    }
    @Test
    public void test_for_first_15_numbers()
    {
        String[] expected={"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};
        assertArrayEquals(expected,FizzBuzz.getnerateSeries(15));
    }
}
