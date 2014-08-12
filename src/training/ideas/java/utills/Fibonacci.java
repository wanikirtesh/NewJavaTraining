package training.ideas.java.utills;

/**
 * ****************************
 * Created by idnkiw on 06-08-2014.
 * *****************************
 */
public class Fibonacci {

    public static int[] getSeries(int elementCount) {
        int[] series = new int[elementCount];
        if(elementCount>=2)
        {
            series[0] = 0;
            series[1] = 1;
           for(int counter=2;counter<elementCount;counter++)
            {
                series[counter] = series[counter-2]+series[counter-1];
            }
        }
        else if(elementCount>0)
        {
            series[0]=0;
        }
        return series;
    }

    public static int[] getRecursive(int elementCount)
    {
       int[] x = new int[elementCount];
       recFunction(x, elementCount);
       return x;
    }

    private static void recFunction(int[] i, int firstNElements)
    {
        if(firstNElements <= 0){
            return;
        }
        if(firstNElements == 1){
            i[0]=0;
            return;
        }
        if(firstNElements == 2){
            i[1]=1;
            return;
        }
        recFunction(i,firstNElements-1);
            i[firstNElements-1]=i[firstNElements-2]+i[firstNElements-3];
    }
}
