package training.ideas.java.characters;

/**
 * ****************************
 * Created by idnkiw on 14-08-2014.
 * *****************************
 */
public class FindArrayInArray {

    public static int find(char[] array1, char[] array2) {
        for(int i=0;i<=array1.length-array2.length;i++)
        {
            boolean found =true;
            for(int j=0;j<array2.length;j++)
            {
                if(Character.toLowerCase(array1[i+j])!= Character.toLowerCase(array2[j]))
                {
                    found=false;
                }
            }
            if(found)
            return i;
        }
        return -1;
    }


    public static int find(char[] array1, char[] array2,int index) {
        for(int i=index;i<=array1.length-array2.length;i++)
        {
            boolean found =true;
            for(int j=0;j<array2.length;j++)
            {
                if(Character.toLowerCase(array1[i+j])!= Character.toLowerCase(array2[j]))
                {
                    found=false;
                }
            }
            if(found)
                return i;
        }
        return -1;
    }
}
