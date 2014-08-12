package training.ideas.java.decisions;

/**
 * Created by idnkiw on 24-07-2014.
 */
public class MINLOSCalculator {
    public static int generateMinlos(String strPatter) {
        return strPatter.indexOf("Y")+1;
    }
}
