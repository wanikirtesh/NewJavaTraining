package training.ideas.java.characters;

import org.junit.Assert;
import org.junit.Test;

/**
 * ****************************
 * Created by idnkiw on 14-08-2014.
 * *****************************
 */
public class LowerCaseTest {
    @Test
    public void capitalize_a_b_c()
    {
        char[] array1={'A','b','C','<'};
        char[] expected={'a','b','c','<'};
        Assert.assertArrayEquals(expected, ConvertCase.getLower(array1));
    }
}
