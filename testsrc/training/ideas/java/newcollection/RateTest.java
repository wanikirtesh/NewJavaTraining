package training.ideas.java.newcollection;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Kirtesh on 20-09-2014.
 */
public class RateTest {
    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    private final Rate r = new Rate("RATE1");

    @Test
    public void test_to_validate_name_of_rate() throws ParseException {
        Assert.assertEquals("RATE1", r.rateName());
    }
    @Test
    public void test_to_validate_value_for_date() throws ParseException {
         Season s1 = new Season(df.parse("01-01-2014"),df.parse("31-01-2014"),20.50);
         r.addSeason(s1);
        Season s2 = new Season(df.parse("01-02-2014"),df.parse("28-02-2014"),30.50);
        r.addSeason(s2);
        Assert.assertEquals(20.50,r.value(df.parse("15-01-2014")));
    }
}
