package training.ideas.java.sort;

/*******************************
 * Created by idnkiw on 24-07-2014.
 *******************************/
public class InsertionSort {
    public static int[] asc(final int[] arrayToBeSort)
    {
        return coreSort(arrayToBeSort,SortTypes.ASCENDING);
    }

    ; static int[] desc(final int[] arrayToBeSort) {
        return coreSort(arrayToBeSort,SortTypes.DESCENDING);
    }


    private  static boolean getCondition(int lhs, int rhs, SortTypes s)
    {
        if(s==SortTypes.ASCENDING)
            return lhs<rhs;
        else
            return rhs<lhs;
    }
    private static int[] coreSort(int[] arrayToBeSort, SortTypes type) {
        int intArrayLength = arrayToBeSort.length;
        for(int i=0;i<intArrayLength-1;i++)
        {
           int temp = arrayToBeSort[i];
           int j=i;
            while(j>=0 && getCondition(arrayToBeSort[j+1],arrayToBeSort[j],type))
            {
                temp = arrayToBeSort[j];
                arrayToBeSort[j]=arrayToBeSort[j+1];
                arrayToBeSort[j+1] = temp;
                j--;
            }
        }
        return arrayToBeSort;
    }

   /* public static int[] sortBubble(int[] arrayToBeSort, SortTypes stype) {

    }*/
}
