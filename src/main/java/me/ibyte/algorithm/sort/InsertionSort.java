package me.ibyte.algorithm.sort;


import me.ibyte.algorithm.Sort;

public class InsertionSort implements Sort {
    @Override
    public Integer[] sort(Integer[] arr) {
        int pervIndex,current;
        for (int i = 1; i < arr.length; i++) {
            current = arr[i];
            pervIndex = i - 1;
            while(pervIndex >= 0 && current < arr[pervIndex]){
                arr[pervIndex+1] = arr[pervIndex];
                pervIndex --;
            }
            arr[pervIndex+1] = current;
        }
        return arr;
    }
}
