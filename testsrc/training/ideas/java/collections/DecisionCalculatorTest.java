package training.ideas.java.collections;

import org.junit.Test;
import org.junit.Assert;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * ****************************
 * Created by Kirtesh Wani on 02-09-2014.
 * for JavaTraining
 * *****************************
 */
public class DecisionCalculatorTest {
    @Test
    public void verify_FPLOS_MINLOS_pattern() throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        Date occupancyDate = df.parse("01-Jan-2014");
        Calendar cl = new GregorianCalendar();
        cl.setTime(occupancyDate);
        TreeMap<String,Double> rateSpectrum = new TreeMap<String,Double>() {{
            put("Rate1",10.0); put("Rate2",12.0);
        }};
        TreeMap<Date,ArrayList<Double>> dtLRV = new TreeMap<Date, ArrayList<Double>>();
        ArrayList<Double> lrvList = new ArrayList<Double>(){{
            add(8.0);add(7.0);add(12.0);add(12.0);add(5.0);add(20.0);add(0.0);
        }};
        dtLRV.put(occupancyDate,lrvList);
         lrvList = new ArrayList<Double>(){{
            add(7.0);add(12.0);add(12.0);add(5.0);add(20.0);add(0.0);add(10.0);
        }};
        cl.add(Calendar.DATE,1);
        dtLRV.put(cl.getTime(),lrvList);
        DecisionCalculator fpMinLosCalculator = new DecisionCalculator(rateSpectrum,dtLRV);
        Assert.assertEquals(populateDecisionMap(),fpMinLosCalculator.calculate());
    }
    private  Map<Date,TreeMap<String,Decision>> populateDecisionMap() throws Exception
    {
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        Date occupancyDate = df.parse("01-Jan-2014");
        Calendar cl = new GregorianCalendar();
        cl.setTime(occupancyDate);
        Map<Date,TreeMap<String,Decision>> resultMap = new TreeMap<Date, TreeMap<String, Decision>>();
        resultMap.put(occupancyDate,new TreeMap<String, Decision>(){{
        Decision d1 = new Decision("YYYYYNY",1);
        put("Rate1", d1);
        d1 = new Decision("YYYYYYY",1);
        put("Rate2",d1);
        }});
        cl.add(Calendar.DATE,1);
        resultMap.put(cl.getTime(),new TreeMap<String, Decision>(){{
        Decision d1 = new Decision("YYNYNYY",1);
        put("Rate1",d1);
        d1 = new Decision("YYYYYYY",1);
        put("Rate2",d1);
        }});
        return resultMap;
    }
}
