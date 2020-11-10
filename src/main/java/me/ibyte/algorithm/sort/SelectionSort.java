package me.ibyte.algorithm.sort;


import me.ibyte.algorithm.Sort;

public class SelectionSort implements Sort {
    @Override
    public Integer[] sort(Integer[] arr) {
        int min,temp;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
