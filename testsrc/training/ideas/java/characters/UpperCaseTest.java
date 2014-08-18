package training.ideas.java.characters;

import org.junit.Assert;
import org.junit.Test;

/**
 * ****************************
 * Created by idnkiw on 14-08-2014.
 * *****************************
 */
public class UpperCaseTest {
    @Test
    public void capitalize_a_b_c()
    {
        char[] array1={'a','b','c','<'};
        char[] expected={'A','B','C','<'};
        Assert.assertArrayEquals(expected, ConvertCase.getUpper(array1));
    }
}
