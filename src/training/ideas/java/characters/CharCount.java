package training.ideas.java.characters;

/**
 * ****************************
 * Created by idnkiw on 18-08-2014.
 * *****************************
 */
public class CharCount {
    public static int getCount(char[] inputArray, char chr) {
        int count=0;
        for(int i=0;i<inputArray.length;i++)
        {
            if(inputArray[i]==chr)
                count++;
        }
        return count;
    }
}
