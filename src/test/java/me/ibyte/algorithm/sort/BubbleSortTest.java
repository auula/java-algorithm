package me.ibyte.algorithm.sort;

import me.ibyte.algorithm.Sort;
import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest  {
    @Test
    public void testSort() {
        Integer[] array = new Integer[]{88,32,12,1,234,11,23,3,6};
        System.out.println(Arrays.toString(array));
        Sort bubble = new BubbleSort();
        Integer[] sort = bubble.sort(array);
        System.out.println(Arrays.toString(sort));
        //[88, 32, 12, 1, 234, 11, 23, 3, 6]
        //[1, 3, 6, 11, 12, 23, 32, 88, 234]
    }
}