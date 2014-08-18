package training.ideas.java.characters;

import org.junit.Assert;
import org.junit.Test;

/**
 * ****************************
 * Created by idnkiw on 14-08-2014.
 * *****************************
 */
public class MergeArrayTest {
    @Test
    public void merge_given_2_array(){
        char[] array1={'a','b','c'};
        char[] array2={'d','e','f'};
        char[] expected={'a','b','c','d','e','f'};
        Assert.assertArrayEquals(expected, MergeArray.merge(array1, array2));
    }
}
