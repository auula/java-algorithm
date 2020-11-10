package me.ibyte.algorithm.sort;

import me.ibyte.algorithm.Sort;
import org.junit.Test;

import java.util.Arrays;


public class QuickSortTest {

    @Test
    public void sort() {
        Integer[] array = new Integer[]{88,32,12,1,234,11,23,3,6};
        System.out.println(Arrays.toString(array));
        Sort quick = new QuickSort();
        Integer[] sort = quick.sort(array);
        System.out.println(Arrays.toString(sort));
    }
}