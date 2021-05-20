package me.ibyte.algorithm.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysTest {

    @Test
    public void insert() throws Exception {
        Arrays arrays = new Arrays();
        arrays.setSize(10);
        arrays.insert(0,1);
        arrays.insert(1,2);
        arrays.insert(0,3);
        arrays.output();
    }
}