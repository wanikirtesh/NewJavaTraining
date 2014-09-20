package training.ideas.java.newcollection;

import training.ideas.java.collections.Decision;
import training.ideas.java.decisions.FPLOSCalculator;
import training.ideas.java.decisions.MINLOSCalculator;

import java.util.*;

/**
 * Created by Kirtesh on 20-09-2014.
 */
public class DecisionCalc {
    private List<Rate> rateSpectrum;

    public DecisionCalc(List<Rate> RateSpectrum){
        rateSpectrum = RateSpectrum;
    }

    public TreeMap<Date, TreeMap<String,Decision>> calculate(TreeMap<Date, ArrayList<Double>> dateWiseLRV) {
        TreeMap<Date,TreeMap<String,Decision>> finalDecisionMap = new TreeMap<Date, TreeMap<String, Decision>>();
        Set<Date> dates = dateWiseLRV.keySet();
        for(Date dt:dates){
            TreeMap<String,Decision> rateDecisionMap = new TreeMap<String,Decision>();
            for(Rate rate:rateSpectrum){
                String pattern = FPLOSCalculator.generateFPLOS(rate.value(dt), dateWiseLRV.get(dt));
                Decision Decision = new Decision(pattern, MINLOSCalculator.generateMinlos(pattern));
                rateDecisionMap.put(rate.rateName(), Decision);
            }
            finalDecisionMap.put(dt, rateDecisionMap);
        }
        return finalDecisionMap;
    }
}
