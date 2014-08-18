package training.ideas.java.characters;

import org.junit.Assert;
import org.junit.Test;

/**
 * ****************************
 * Created by idnkiw on 14-08-2014.
 * *****************************
 */
public class SubArrayTest {
    @Test
    public void get_sub_array_before_index()
    {
        char[] inputArray = {'a','b','r','4','t','y','o','l','p','v'};
        int index= 5;
        char[] expectedArray={'y','o','l','p','v'};
        Assert.assertArrayEquals(expectedArray,SubArray.getFromIndex(inputArray, index,9));
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void get_sub_array_before_15()
    {
        char[] inputArray = {'a','b','r','4','t','y','o','l','p','v'};
        int index= 15;
        char[] expectedArray={'a','b','r','4','t','y','o','l','p','v'};
        Assert.assertArrayEquals(expectedArray,SubArray.getFromIndex(inputArray, index,18));
    }

    @Test
    public void get_sub_array_before_9()
    {
        char[] inputArray = {'a','b','r','4','t','y','o','l','p','v'};
        int index= 9;
        char[] expectedArray={'v'};
        Assert.assertArrayEquals(expectedArray,SubArray.getFromIndex(inputArray, index,18));
    }


}
