package training.ideas.java.sort;

/**
 * ****************************
 * Created by idnkiw on 31-07-2014.
 * *****************************
 */
public class BubbleSort {

    public static int[] asc(final int[] arrayToBeSort)
    {
        return coreSort(arrayToBeSort,1);
    }

    public static int[] desc(final int[] arrayToBeSort) {
        return coreSort(arrayToBeSort,-1);
    }

    private static int[] coreSort(final int[] arrayToBeSort,int factor)
    {
        int startPt;
        int stopPt;
        if(factor==1) {
            startPt = 1;
            stopPt = arrayToBeSort.length;
        }
        else {
            startPt = (arrayToBeSort.length*-1)+2;
            stopPt = 1;
        }
        for (int arrayCounter = 1; arrayCounter < arrayToBeSort.length; arrayCounter++)
        {
            for(int j=startPt;j<=stopPt-arrayCounter;j++)
            {
                if(arrayToBeSort[(j-1)*factor]>arrayToBeSort[(j*factor)])
                {
                    int temp = arrayToBeSort[(j-1)*factor];
                    arrayToBeSort[(j-1)*factor]=arrayToBeSort[(j*factor)];
                    arrayToBeSort[(j*factor)] = temp;
                }
            }
        }
        return arrayToBeSort;
    }
}
