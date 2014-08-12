package training.ideas.java.sort;

/**
 * ****************************
 * Created by idnkiw on 04-08-2014.
 * *****************************
 */
public class SelectionSort {
    public static int[] asc(final int[] arrayToBeSort)
    {
        return coreSort(arrayToBeSort,SortTypes.ASCENDING);
    }

    public static int[] desc(final int[] arrayToBeSort) {
        return coreSort(arrayToBeSort,SortTypes.DESCENDING);
    }


    private static int[] coreSort(int[] numbers,SortTypes sortType) {
        int pointer;
        boolean condition;
        for (int pointer_cnt = 0; pointer_cnt < numbers.length-1 ; pointer_cnt++) {
            pointer = pointer_cnt;
            for (int j = pointer +1; j <= numbers.length-1 ; j++) {
                if(sortType==SortTypes.ASCENDING){
                    condition = numbers[pointer] > numbers[j];
                }
                else{
                    condition = numbers[pointer] < numbers[j];
                }
                if(condition){
                    int temp = numbers[pointer];
                    numbers[pointer] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }
}
