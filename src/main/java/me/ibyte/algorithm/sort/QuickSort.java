package me.ibyte.algorithm.sort;


import me.ibyte.algorithm.Sort;


// https://www.bilibili.com/video/BV1at411T75o?zw
public class QuickSort implements Sort {
    @Override
    public Integer[] sort(Integer[] arr) {
        return quickSort(arr, 0, arr.length - 1);
    }

    private Integer[] quickSort(Integer[] arr, int left, int right) {
        if (left >= right) {
            return arr;
        }
        // L记录开始位置 R记录尾巴位置
        int pivot = arr[left], L = left, R = right;
        while (left < right) {
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = pivot;
        // L =0 left = 是中心轴值的位置 -1 分左右作用
        quickSort(arr, L, left - 1);
        quickSort(arr, left + 1, R);
        return arr;
    }


}
