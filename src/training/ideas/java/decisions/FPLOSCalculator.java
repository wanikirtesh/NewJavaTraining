package training.ideas.java.decisions;

import java.util.List;

/**
 * Created by idnkiw on 24-07-2014.
 */
public class FPLOSCalculator {
    public static String generateFPLOS(final double rate, final double[] dblLrv) {
        double sumLRV=0;
        String strFPLOS="";
        int losCounter=1;
        for(double lrv:dblLrv)
        {
            sumLRV+=lrv;
            if(sumLRV<=(losCounter*rate))
                strFPLOS+="Y";
            else
                strFPLOS+="N";
            losCounter++;
        }
        return strFPLOS;
    }


    public static String generateFPLOS(final double rate, final List<Double> dblLrv) {
        double sumLRV=0;
        String strFPLOS="";
        int losCounter=1;
        for(double lrv:dblLrv)
        {
            sumLRV+=lrv;
            if(sumLRV<=(losCounter*rate))
                strFPLOS+="Y";
            else
                strFPLOS+="N";
            losCounter++;
        }
        return strFPLOS;
    }

    public static String[] generateFPLOS(double[] rates, double[] dblLrv) {
        String[] spectrum = new String[rates.length];
        int counter=0;
        for(double rate:rates)
        {
            spectrum[counter++]= generateFPLOS(rate, dblLrv);
        }
        return spectrum;
    }
}
