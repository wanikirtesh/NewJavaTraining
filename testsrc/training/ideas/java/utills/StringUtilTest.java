package training.ideas.java.utills;

import org.junit.Assert;
import org.junit.Test;

/**
 * ****************************
 * Created by idnkiw on 11-08-2014.
 * *****************************
 */
public class StringUtilTest {
    @Test
    public void test_for_compress_string_AAAABBCDEEE()
    {
       Assert.assertEquals("A4B2CDE3",StringUtil.compress("AAAABBCDEEE"));
    }
    @Test
    public void test_for_decompress_string_A4B2CDE3()
    {
        int[][] x= new int[5][4];
        System.out.println(x.length);
        System.out.println(x[0].length);
      // Assert.

       // Assert.assertEquals("AAAABBCDEEE", StringUtil.deCompress("A4B2CDE3"));
    }
}
