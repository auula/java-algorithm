package me.ibyte.algorithm.sort;


import me.ibyte.algorithm.Sort;



public class QuickSort implements Sort {
    @Override
    public Integer[] sort(Integer[] arr) {
        return quickSort(arr,0,arr.length-1);
    }

    private  Integer[] quickSort(Integer[] arr, int left, int right) {
        if (left >= right) {
            return arr;
        }
        int pivot = arr[left],L=left,R=right;
        while(left < right){
            while (left < right && arr[right] >= pivot){
                right--;
            }
            arr[left] = arr[right];
            while(left < right && arr[left] <= pivot){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = pivot;
        quickSort(arr,L,right-1);
        quickSort(arr,right+1,R);
        return  arr;
    }


}
