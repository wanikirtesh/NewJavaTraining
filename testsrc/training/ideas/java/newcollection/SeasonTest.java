package training.ideas.java.newcollection;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Kirtesh on 20-09-2014.
 */
public class SeasonTest {
    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    Season s;
    public SeasonTest() throws Exception {
        s = new Season(df.parse("01-01-2014"),df.parse("31-01-2014"),25.50);
    }


    @Test
    public void test_for_value() throws ParseException {
        Assert.assertEquals(25.50, s.value(),0);
    }

    @Test
    public void test_for_date_in_season() throws ParseException {
        Assert.assertTrue(s.dateInSeson(df.parse("15-01-2014")));
    }

}
