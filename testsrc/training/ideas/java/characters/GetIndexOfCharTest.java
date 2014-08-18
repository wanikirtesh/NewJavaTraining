package training.ideas.java.characters;

import org.junit.Assert;
import org.junit.Test;

/**
 * ****************************
 * Created by idnkiw on 14-08-2014.
 * *****************************
 */
public class GetIndexOfCharTest {
    @Test
    public void get_index_of_i()
    {
        char[] array1={'a','b','c'};
        Assert.assertEquals(2,GetIndexOfChar.get(array1,'c'));
    }
    @Test
    public void get_index_of_f()
    {
        char[] array1={'a','b','c'};
        Assert.assertEquals(-1,GetIndexOfChar.get(array1,'f'));
    }
    @Test
    public void get_index_of_a()
    {
        char[] array1={'a','b','c'};
        Assert.assertEquals(0,GetIndexOfChar.get(array1,'a'));
    }
}
