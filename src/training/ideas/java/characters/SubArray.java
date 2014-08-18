package training.ideas.java.characters;

/**
 * ****************************
 * Created by idnkiw on 18-08-2014.
 * *****************************
 */
public class SubArray {
    public static char[] getUpToIndex(char[] inputArray, int index) {
        char[] returnArray= new char[inputArray.length>=index+1?index+1:inputArray.length];
        int i=0;
        while(i<inputArray.length&&i<=index)
        {
            returnArray[i]=inputArray[i];
            i++;
        }
        return returnArray;
    }

    public static char[] getFromIndex(char[] inputArray, int stindex,int enIndex) {
        if(enIndex<stindex||stindex>inputArray.length)
        {
            throw new IndexOutOfBoundsException();
        }
        char[] returnArray= new char[inputArray.length>=enIndex?enIndex-stindex+1:inputArray.length-stindex];
        int i=stindex;
        int counter=0;
        while(i<inputArray.length&&i<=enIndex)
        {
            returnArray[counter++]=inputArray[i++];
        }
        return returnArray;
    }

}
