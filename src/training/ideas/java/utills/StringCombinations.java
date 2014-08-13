package training.ideas.java.utills;

/**
 * ****************************
 * Created by idnkiw on 13-08-2014.
 * *****************************
 */
public class StringCombinations {
    public static String[] get(String inpString) {
        String[] actual = new String[inpString.length()];
        for(int i=0;i<inpString.length();i++) {
            actual[i]=inpString;
            inpString = inpString.substring(1)+inpString.substring(0,1);
        }
        return actual;
    }
}
