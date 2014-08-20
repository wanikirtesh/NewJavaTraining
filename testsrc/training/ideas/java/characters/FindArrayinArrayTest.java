package training.ideas.java.characters;

import org.junit.Assert;
import org.junit.Test;

/**
 * ****************************
 * Created by idnkiw on 14-08-2014.
 * *****************************
 */
public class FindArrayInArrayTest {
    @Test
    public void find_sub_array()
    {
        char[] array1={'a','b','c','k','d','e'};
        char[] array2={'k','s'};
        Assert.assertEquals(-1, FindArrayInArray.find(array1, array2));
    }

    @Test
    public void find_sub_array_1()
    {
        char[] array1={'a','b','c','k','d','e'};
        char[] array2={'a','b'};
        Assert.assertEquals(0, FindArrayInArray.find(array1, array2));
    }

    @Test
    public void find_sub_array_2()
    {
        char[] array1={'a','b','d','c','k','d','d'};
        char[] array2={'d'};
        Assert.assertEquals(2, FindArrayInArray.find(array1, array2));
    }
    @Test
    public void test1()
    {
        char []  input= {'d','d','f','f','d','c','d','x','f','c'};
        char [] serach_arr = {'f','f','c'};
        Assert.assertEquals(-1, FindArrayInArray.find(input, serach_arr));
    }
}
