package test.ua.com.goit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ua.com.goit.task5.Array;

import static org.junit.Assert.*;

public class ArrayTest {

    private static Array array;

    @BeforeClass
    public static void setUpClass() throws Exception {
        array = new Array(new int[]{3, 4, 6, 2, 1, 8});

    }

    @Test(timeout = 2000)
    public void testBiggerElement() throws Exception {
        int smallerElementResult = array.smallerElement();
        int smallerElementExpected = 1;
        assertEquals(smallerElementExpected, smallerElementResult);

    }

    @Test(timeout = 2000)
    public void testSmallerElement() throws Exception {
        int biggerElementResult = array.biggerElement();
        int biggerElementExpected = 8;
        assertEquals(biggerElementExpected, biggerElementResult);
    }

    @Test(timeout = 2000)
    public void testRangeDecrease() throws Exception {
       final int [] increaseResult = array.rangeIncrease();
       final int [] increaseExpected = {1, 2, 3, 4, 6, 8};
       assertArrayEquals(increaseExpected, increaseResult);

    }

    @Test(timeout = 2000)
    public void testRangeIncrease() throws Exception {
        final int [] decreaseResult = array.rangeDecrease();
        final int [] decreaseExpected = {8, 6, 4, 3, 2, 1};
        assertArrayEquals(decreaseExpected, decreaseResult);
    }
}