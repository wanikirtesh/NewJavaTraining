package training.ideas.java.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * ****************************
 * Created by Kirtesh Wani on 27-08-2014.
 * for JavaTraining
 * *****************************
 */
public class FindUniqueTest {
    @Test
    public void test_for_unique_windows_handler()
    {
        String[] arrWindowsHandler = {"002341qwers","x13029340954","x13029340954","002341qwers"};
        Set<String> setWindowsHandlers = new HashSet<String>();
        setWindowsHandlers.add("002341qwers");
        setWindowsHandlers.add("x13029340954");
        Assert.assertEquals(setWindowsHandlers,FindUnique.get(arrWindowsHandler));
    }
}
