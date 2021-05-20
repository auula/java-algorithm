package me.ibyte.algorithm.sort;


import me.ibyte.algorithm.Sort;


// https://www.bilibili.com/video/BV1at411T75o?zw
public class QuickSort implements Sort {
    String str = "____                        __                      \n" +
            "/\\  _`\\                     /\\ \\                     \n" +
            "\\ \\ \\L\\ \\    ___     ___ ___\\ \\ \\____     __   _ __  \n" +
            " \\ \\  _ <'  / __`\\ /' __` __`\\ \\ '__`\\  /'__`\\/\\`'__\\\n" +
            "  \\ \\ \\L\\ \\/\\ \\L\\ \\/\\ \\/\\ \\/\\ \\ \\ \\L\\ \\/\\  __/\\ \\ \\/ \n" +
            "   \\ \\____/\\ \\____/\\ \\_\\ \\_\\ \\_\\ \\_,__/\\ \\____\\\\ \\_\\ \n" +
            "    \\/___/  \\/___/  \\/_/\\/_/\\/_/\\/___/  \\/____/ \\/_/ \n" +
            "                                                     ";
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
