package training.ideas.java.characters;

/**
 * ****************************
 * Created by idnkiw on 14-08-2014.
 * *****************************
 */
public class ConvertCase {
    public static char[] getLower(char[] array1) {
        char[] actuals = new char[array1.length];
        for(int i=0;i<array1.length;i++)
            actuals[i]=Character.toLowerCase(array1[i]);
        return actuals;
    }
    public static char[] getUpper(char[] array1) {
        char[] actuals = new char[array1.length];
        for(int i=0;i<array1.length;i++)
            actuals[i]=Character.toUpperCase(array1[i]);
        return actuals;
    }
}
