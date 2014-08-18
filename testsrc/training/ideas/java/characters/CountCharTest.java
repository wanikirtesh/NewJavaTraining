package training.ideas.java.characters;

import org.junit.Assert;
import org.junit.Test;

/**
 * ****************************
 * Created by idnkiw on 18-08-2014.
 * *****************************
 */
public class CountCharTest {
    @Test
    public void get_count_of_char_a()
    {
        char[] inputArray ={'a','d','v','a','s','x','v','a','r','d','x'};
        Assert.assertEquals(3,CharCount.getCount(inputArray,'a'));
    }
}
