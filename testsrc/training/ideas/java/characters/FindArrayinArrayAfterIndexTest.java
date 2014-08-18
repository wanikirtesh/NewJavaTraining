package training.ideas.java.characters;

import org.junit.Assert;
import org.junit.Test;

/**
 * ****************************
 * Created by idnkiw on 14-08-2014.
 * *****************************
 */
public class FindArrayInArrayAfterIndexTest {
    @Test
    public void find_sub_array()
    {
        char[] array1={'a','b','c','k','d','e'};
        char[] array2={'c','K'};
        Assert.assertEquals(-1, FindArrayInArray.find(array1, array2),3);
    }
}
