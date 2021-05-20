package me.ibyte.algorithm.array;

/**
 * @ Author: Ding <br/>
 * @ Version: V1.0
 * @ Notes: 自定义数组，有扩容还有插入功能
 * <p>
 * Created with IDEA. Date：2021/5/20 2:09 下午
 * <a href="https://github.com/higker">Github Home Page</a>
 * </p>
 */
public class Arrays {

    private int[] arr;
    private int size;


    public void insert(int index, int obj) throws Exception {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("index out of bound");
        }

        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

        this.arr[index] = obj;
        size++;
    }

    public void output() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.arr = new int[size];
    }
}
