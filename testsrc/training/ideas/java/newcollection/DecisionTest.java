package training.ideas.java.newcollection;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Kirtesh on 20-09-2014.
 */
public class DecisionTest {
    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    @Test
    public void decisionTest() throws ParseException {
        List<Rate> rateList = new ArrayList<Rate>();
        Rate r1 = new Rate("Rate1");
        r1.addSeason(new Season(df.parse("01-01-2014"),df.parse("31-01-2014"),20.50));
        rateList.add(r1);
        DecisionCalc d = new DecisionCalc(rateList);
    }
}
