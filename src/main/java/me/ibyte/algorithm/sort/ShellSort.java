package me.ibyte.algorithm.sort;


import me.ibyte.algorithm.Sort;



public class ShellSort implements Sort {

    @Override
    public Integer[] sort(Integer[] arr) {
        int pervIndex,current;
        for (int gap = arr.length; gap > 0; gap/=2) {
            for (int i = gap; i <  arr.length; i++) {
                current = arr[i];
                pervIndex = i - gap;
                while(pervIndex >= 0 && current < arr[pervIndex]){
                    arr[pervIndex+gap] = arr[pervIndex];
                    pervIndex -= gap;
                }
                arr[pervIndex + gap] = current;
            }
        }
        return arr;
    }
    
}
