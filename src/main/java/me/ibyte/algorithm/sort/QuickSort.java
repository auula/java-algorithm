package me.ibyte.algorithm.sort;


import me.ibyte.algorithm.Sort;



public class QuickSort implements Sort {
    @Override
    public Integer[] sort(Integer[] arr) {
        return quickSort(arr,0,arr.length-1);
    }

    private int partition(Integer[] arr, int left, int right) {
        int temp = arr[left];
        while (right > left) {
            // 先判断基准数和后面的数依次比较
            while (temp <= arr[right] && left < right) {
                --right;
            }
            // 当基准数大于了 arr[right]，则填坑
            if (left < right) {
                arr[left] = arr[right];
                ++left;
            }
            // 现在是 arr[right] 需要填坑了
            while (temp >= arr[left] && left < right) {
                ++left;
            }
            if (left < right) {
                arr[right] = arr[left];
                --right;
            }
        }
        arr[left] = temp;
        return left;
    }

    private  Integer[] quickSort(Integer[] arr, int left, int right) {
        if (arr == null || left >= right || arr.length <= 1)
            return null;
        int mid = partition(arr, left, right);
        quickSort(arr, left, mid);
        quickSort(arr, mid + 1, right);
        return  arr;
    }


}
