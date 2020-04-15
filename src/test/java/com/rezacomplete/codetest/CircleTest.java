package com.rezacomplete.codetest;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by Reza on 4/15/2020.
 */
public class CircleTest {

    @Test
    public void executeCircleWith5ChildrenAndK3() {
        Result result = Circle.executeCircle(5, 3);
        assertArrayEquals(new Object[] {3, 1, 5, 2}, result.getLosers().toArray());
        assertEquals(4, result.getWinner());
    }

    @Test
    public void executeCircleWith5ChildrenAndK2() {
        Result result = Circle.executeCircle(5, 2);
        assertArrayEquals(new Object[] {2, 4, 1, 5}, result.getLosers().toArray());
        assertEquals(3, result.getWinner());
    }

    @Test
    public void executeCircleWith5ChildrenAndK1() {
        Result result = Circle.executeCircle(5, 1);
        assertArrayEquals(new Object[] {1, 2, 3, 4}, result.getLosers().toArray());
        assertEquals(5, result.getWinner());
    }

    @Test
    public void executeCircleWith5ChildrenAndK5() {
        Result result = Circle.executeCircle(5, 5);
        assertArrayEquals(new Object[] {5, 1, 3, 4}, result.getLosers().toArray());
        assertEquals(2, result.getWinner());
    }

    @Test
    public void executeCircleWith50ChildrenAndK5() {
        Result result = Circle.executeCircle(20, 5);
        assertEquals(7, result.getWinner());
    }

    @Test(expected = InvalidNumberOfChildren.class)
    public void executeCircleWithNoChildren() {
        Circle.executeCircle(0, 5);
    }

    @Test(expected = InvalidIndex.class)
    public void executeCircleWithInvalidIndex() {
        Circle.executeCircle(10, 0);
    }
}
