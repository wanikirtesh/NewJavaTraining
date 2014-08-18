package training.ideas.java.characters;

import org.junit.Assert;
import org.junit.Test;

/**
 * ****************************
 * Created by idnkiw on 14-08-2014.
 * *****************************
 */
public class GetIndexOfCharAfterIndexTest {
    @Test
    public void get_index_of_a()
    {
        char[] array1={'a','b','c','a','b','c'};
        Assert.assertEquals(3,GetIndexOfChar.get(array1,'a',1));
    }
}
