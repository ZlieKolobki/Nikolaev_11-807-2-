package com.company;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntArrayListTest {
    IntArrayList ial;

    @Before
    public void setUp(){
        ial = new IntArrayList();
        for (int i = 9; i > 0; i--) {
            ial.add(i);
        }
    }

    @Test
    public void sortTest(){
        int expected = 1;
        ial.sort();
        int actual = ial.get(1);
        assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        int expected = ial.get(5);
        ial.remove(4);
        int actual = ial.get(4);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeGet(){
        ial.get(-1);
    }

    @Test
    public void toArrayTest(){
        int[] expected = {9,8,7,6,5,4,3,2,1};
        int[] actual = ial.toArray();
        assertArrayEquals(expected,actual);
    }
    @Test
    public void containsTest(){
        boolean expected = true;
        boolean actual = ial.contains(5);
        assertEquals(expected,actual);
    }
}
