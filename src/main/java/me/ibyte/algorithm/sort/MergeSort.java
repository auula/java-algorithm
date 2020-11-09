package me.ibyte.algorithm.sort;

import me.ibyte.algorithm.Sort;

import java.util.Arrays;

// Go写多换了Java写一些 思路和逻辑是一样的
public class MergeSort implements Sort {

    public Integer[] sort(Integer[] arr) {
        // 取到中轴 分组
        int middle = arr.length / 2;
        if (arr.length < 2) {
            return arr;
        }
        // 通过中轴分左右组
        Integer[] left = Arrays.copyOfRange(arr, 0, middle);
        Integer[] right = Arrays.copyOfRange(arr, middle, arr.length);
        // 重复分组 直到不能分组为止并且进行小块归并排序
        return merge(sort(left), sort(right));
    }

    private Integer[] merge(Integer[] left, Integer[] right) {
        // 存放排序好的零时数组
        Integer[] result = new Integer[left.length + right.length];
        int i = 0;
        // 不为空就进行排序
        while (left.length != 0 && right.length != 0) {
            if (left[0] <= right[0]) {
                result[i++] = left[0];
                // 排好的就减去
                left = Arrays.copyOfRange(left, 1, left.length);
            } else {
                result[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }
        // 检测剩下的
        while (left.length != 0) {
            result[i++] = left[0];
            left = Arrays.copyOfRange(left, 1, left.length);
        }
        while (right.length != 0) {
            result[i++] = right[0];
            right = Arrays.copyOfRange(right, 1, right.length);
        }
        return result;
    }
}
