package training.ideas.java.characters;

/**
 * ****************************
 * Created by idnkiw on 14-08-2014.
 * *****************************
 */
public class MergeArray {
    public static char[] merge(char[] array1, char[] array2) {
        char[] actual = new char[array1.length+array2.length];
        for(int i=0;i<array1.length;i++)
            actual[i]=array1[i];
        for(int i=0;i<array2.length;i++)
            actual[array1.length+i]=array2[i];
        return actual;
    }
}
