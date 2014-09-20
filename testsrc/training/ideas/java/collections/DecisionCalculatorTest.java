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
    public void test_to_verify_FPLOS_MINLOS_pattern_for_various_N_Y() throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        /* Creating RateSpectrum*/
        TreeMap<String,Double> rateSpectrum = new TreeMap<String,Double>() {{
            put("Rate1",10.0); put("Rate2",12.0);
        }};
        /*Creating DateWise LRV Map */
        TreeMap<Date,List<Double>> dtLRV = new TreeMap<Date, List<Double>>();
        dtLRV.put(df.parse("01-Jan-2014"),Arrays.asList(8.0,7.0,12.0,12.0,5.0,20.0,0.0));
        dtLRV.put(df.parse("02-Jan-2014"),Arrays.asList(7.0,12.0,12.0,5.0,20.0,0.0,10.0));
        DecisionCalculator fpMinLosCalculator = new DecisionCalculator(rateSpectrum);
        Assert.assertEquals(populateExpectedDecisionMap(dtLRV, rateSpectrum, "YYYYYNY", "YYYYYYY", "YYNYNYY", "YYYYYYY"),fpMinLosCalculator.calculate(dtLRV));
    }


    @Test
    public void test_to_verify_FPLOS_MINLOS_pattern_for_all_N() throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        /* Creating RateSpectrum*/
        TreeMap<String,Double> rateSpectrum = new TreeMap<String,Double>() {{
            put("Rate1",5.0); put("Rate2",2.0);
        }};
        /*Creating DateWise LRV Map */
        TreeMap<Date,List<Double>> dtLRV = new TreeMap<Date, List<Double>>();
        dtLRV.put(df.parse("01-Jan-2014"),Arrays.asList(8.0,7.0,12.0,12.0,15.0,20.0,10.0));
        dtLRV.put(df.parse("02-Jan-2014"),Arrays.asList(7.0,12.0,12.0,15.0,20.0,10.0,10.0));
        DecisionCalculator fpMinLosCalculator = new DecisionCalculator(rateSpectrum);
        Assert.assertEquals(populateExpectedDecisionMap(dtLRV, rateSpectrum, "NNNNNNN", "NNNNNNN", "NNNNNNN", "NNNNNNN"),fpMinLosCalculator.calculate(dtLRV));
    }

    @Test
    public void test_to_verify_FPLOS_MINLOS_pattern_for_all_Y() throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        /* Creating RateSpectrum*/
        TreeMap<String,Double> rateSpectrum = new TreeMap<String,Double>() {{
            put("Rate1",25.0); put("Rate2",22.0);
        }};
        /*Creating DateWise LRV Map */
        TreeMap<Date,List<Double>> dtLRV = new TreeMap<Date, List<Double>>();
        dtLRV.put(df.parse("01-Jan-2014"),Arrays.asList(8.0,7.0,12.0,12.0,15.0,20.0,10.0));
        dtLRV.put(df.parse("02-Jan-2014"),Arrays.asList(7.0,12.0,12.0,15.0,20.0,10.0,10.0));
        DecisionCalculator fpMinLosCalculator = new DecisionCalculator(rateSpectrum);
        Assert.assertEquals(populateExpectedDecisionMap(dtLRV, rateSpectrum, "YYYYYYY", "YYYYYYY", "YYYYYYY", "YYYYYYY"),fpMinLosCalculator.calculate(dtLRV));
    }





    private TreeMap<Date, TreeMap<String,Decision>> populateExpectedDecisionMap(TreeMap<Date, List<Double>> dtLRV, TreeMap<String, Double> rateSpectrum, String... expectedFPLOS) {
        TreeMap<Date, TreeMap<String,Decision>> populatedMap = new TreeMap<Date, TreeMap<String, Decision>>();
        Set<Date> dateSet = dtLRV.keySet();
        Set<String> rates = rateSpectrum.keySet();
        int cnt =0;
        for(Date dt:dateSet){
            TreeMap<String,Decision> decisionMap = new TreeMap<String, Decision>();
            for(String rate:rates){
                decisionMap.put(rate,new Decision(expectedFPLOS[cnt],expectedFPLOS[cnt].toUpperCase().indexOf("Y")+1));
                cnt++;
            }
            populatedMap.put(dt,decisionMap);
        }
        return populatedMap;
    }
}
