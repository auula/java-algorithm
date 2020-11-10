package me.ibyte.algorithm.sort;

import me.ibyte.algorithm.Sort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void sort() {
        Integer[] array = new Integer[]{88,32,12,1,234,11,23,3,6};
        System.out.println(Arrays.toString(array));
        Sort insert = new InsertionSort();
        Integer[] sort = insert.sort(array);
        System.out.println(Arrays.toString(sort));
    }
}