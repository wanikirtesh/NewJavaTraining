package training.ideas.java.utills;

import org.junit.Assert;
import org.junit.Test;

/**
 * ****************************
 * Created by idnkiw on 13-08-2014.
 * *****************************
 */
public class StringCombinationsTest {

    @Test
    public void test_combination_for_INDIA()
    {
        String inpString="INDIA";
        String[] expected ={"INDIA","NDIAI","DIAIN","IAIND","AINDI"};
        Assert.assertArrayEquals(expected,StringCombinations.get(inpString));
    }
}
