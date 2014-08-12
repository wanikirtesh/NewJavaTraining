package training.ideas.java.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * ****************************
 * Created by idnkiw on 31-07-2014.
 * *****************************
 */
public class BubbleSortTest {
    @Test
    public void Sort_Ascending_integer_Array(){
        int[] arrayToBeSort = {3,5,7,8,2,9,1,4,6};
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, BubbleSort.asc(arrayToBeSort));
    }
    @Test
    public void Sort_Ascending_negative_integer_Array(){
        int[] arrayToBeSort = {-12,10,5,-7,52};
        Assert.assertArrayEquals(new int[]{-12,-7,5,10,52},BubbleSort.asc(arrayToBeSort));
    }

    @Test
    public void Sort_Ascending_negative_integer_Array_desc(){
        int[] arrayToBeSort = {-12,10,5,-7,52};
        Assert.assertArrayEquals(new int[]{52,10,5,-7,-12},BubbleSort.desc(arrayToBeSort));
    }

    @Test
    public void Sort_Ascending_0_integer_Array(){
        int[] arrayToBeSort = {8,0,7,4,9};
        Assert.assertArrayEquals(new int[]{0,4,7,8,9},BubbleSort.asc(arrayToBeSort));
    }

    @Test
    public void Sort_Descending_integer_Array(){
        int[] arrayToBeSort = {1,2,3,4};
        Assert.assertArrayEquals(new int[]{4,3,2,1},BubbleSort.desc(arrayToBeSort));
    }

    @Test
    public void Sort_Ascending__integer_Array(){
        int[] arrayToBeSort = {4,3,2,1};
        Assert.assertArrayEquals(new int[]{1,2,3,4},BubbleSort.asc(arrayToBeSort));
    }

    @Test
    public void Sort_Ascending_integer_Array_desc(){
        int[] arrayToBeSort = {3,5,7,8,2,9,1,4,6};
        Assert.assertArrayEquals(new int[]{9,8,7,6,5,4,3,2,1}, BubbleSort.desc(arrayToBeSort));
    }

}
