package training.ideas.java.characters;

import org.junit.Assert;
import org.junit.Test;

/**
 * ****************************
 * Created by idnkiw on 14-08-2014.
 * *****************************
 */
public class SubArrayBeforeTest {
    @Test
    public void get_sub_array_before_index()
    {
        char[] inputArray = {'a','b','r','4','t','y','o','l','p','v'};
        int index= 5;
        char[] expectedArray={'a','b','r','4','t','y'};
        Assert.assertArrayEquals(expectedArray,SubArray.getUpToIndex(inputArray, index));
    }
    @Test
    public void get_sub_array_before_15()
    {
        char[] inputArray = {'a','b','r','4','t','y','o','l','p','v'};
        int index= 15;
        char[] expectedArray={'a','b','r','4','t','y','o','l','p','v'};
        Assert.assertArrayEquals(expectedArray,SubArray.getUpToIndex(inputArray, index));
    }
    @Test
    public void get_sub_array_before_index_0()
    {
        char[] inputArray = {'a','b','r','4','t','y','o','l','p','v'};
        int index= 0;
        char[] expectedArray={'a'};
        Assert.assertArrayEquals(expectedArray,SubArray.getUpToIndex(inputArray, index));
    }
}
