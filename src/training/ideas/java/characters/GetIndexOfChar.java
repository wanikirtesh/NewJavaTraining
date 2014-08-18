package training.ideas.java.characters;

/**
 * ****************************
 * Created by idnkiw on 14-08-2014.
 * *****************************
 */
public class GetIndexOfChar {
    public static int get(char[] array1, char c) {
        int index=-1;
        for(int i=0;i<array1.length;i++)
            if(array1[i]==c)
                return i;
        return index;
    }

    public static int get(char[] array1, char char1, int index) {

        int retIndex=-1;
        for(int i=index;i<array1.length;i++)
            if(array1[i]==char1)
                return i;
        return retIndex;
    }
}
