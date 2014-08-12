package training.ideas.java.sort;

import org.junit.Test;

/**
 * ****************************
 * Created by idnkiw on 04-08-2014.
 * *****************************
 */
public class SortSpeedTest {
    int[] arrayToBeSort = {3,5,7,8,2,9,1,4,6};
    @Test
    public void bubbleSortTest(){
        for(int i=1;i<=35000;i++)
        {
            int[] arrayToBeSort = {3,5,7,8,2,9,1,4,6};
            BubbleSort.asc(arrayToBeSort);
        }
    }
    @Test
    public void insertionSortTest(){
        for(int i=1;i<=35000;i++)
        {
            int[] arrayToBeSort = {3,5,7,8,2,9,1,4,6};
            InsertionSort.asc(arrayToBeSort);
        }
    }
    @Test
    public void selectionSortTest(){
        for(int i=1;i<=35000;i++)
        {
            int[] arrayToBeSort = {3,5,7,8,2,9,1,4,6};
            SelectionSort.asc(arrayToBeSort);
        }
    }
}
