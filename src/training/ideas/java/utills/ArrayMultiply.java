package training.ideas.java.utills;

/**
 * ****************************
 * Created by Kirtesh Wani on 25-08-2014.
 * for JavaTraining
 * *****************************
 */
public class ArrayMultiply {
    public static int[][] perform(int[][] array1, int[][] array2) {
        int[][] resultArray = new int[array1.length][array2[0].length];
        /*Columns*/
        for(int i=0;i<array2[0].length;i++)
        {
            /*Rows*/
            for(int j=0;j<array1.length;j++){
                int result=0;
                for(int ccol=0;ccol<array2.length;ccol++)
                {
                    result+=(array1[j][ccol]*array2[ccol][i]);
                }
                resultArray[j][i]=result;
            }
        }

        return resultArray;
    }
}
