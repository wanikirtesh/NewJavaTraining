package training.ideas.java.collections;

import training.ideas.java.decisions.FPLOSCalculator;
import training.ideas.java.decisions.MINLOSCalculator;

import java.util.*;

/**
 * ****************************
 * Created by Kirtesh Wani on 02-09-2014.
 * for JavaTraining
 * *****************************
 */
public class DecisionCalculator {
    /// Constructor
    private TreeMap<String, Double> rateSpectrum;
    private TreeMap<Date, ArrayList<Double>> dateWiseLRV;

    public DecisionCalculator(TreeMap<String, Double> RateSpectrum, TreeMap<Date, ArrayList<Double>> DateWiseLRV){
        rateSpectrum = RateSpectrum;
        dateWiseLRV = DateWiseLRV;
    }

    public TreeMap<Date, TreeMap<String,Decision>> calculate() {
        TreeMap<Date,TreeMap<String,Decision>> finalDecisionMap = new TreeMap<Date, TreeMap<String, Decision>>();
        Set<Date> dates = dateWiseLRV.keySet();
        for(Date dt:dates){
            TreeMap<String,Decision> rateDecisionMap = new TreeMap<String,Decision>();
            Set<String> rateNames = rateSpectrum.keySet();
            for(String rateName:rateNames){
                String pattern = FPLOSCalculator.generateFPLOS(rateSpectrum.get(rateName), dateWiseLRV.get(dt));
                Decision Decision = new Decision(pattern,MINLOSCalculator.generateMinlos(pattern));
                rateDecisionMap.put(rateName, Decision);
            }
            finalDecisionMap.put(dt, rateDecisionMap);
        }
        return finalDecisionMap;
    }
}
