package service;

import junit.framework.TestCase;
import org.junit.Assert;

public class HomeWorkServiceTest extends TestCase {

    public void testFlipBinaryArray() {
        byte[] inputByteArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        byte[] outputByteArray = {0, 0, 1, 1, 0, 1, 0, 0, 1, 1};

        Assert.assertArrayEquals(HomeWorkService.flipBinaryArray(inputByteArray), outputByteArray);
    }

    public void testFillEmptyArray() {
        byte[] outputFilledArray = HomeWorkService.fillEmptyArray();

        assertEquals(outputFilledArray.length, 100);
        assertEquals(outputFilledArray[0], 1);
        assertEquals(outputFilledArray[outputFilledArray.length - 1], 100);
    }

    public void testDoMultiplication() {
        byte[] outputFilledArray = HomeWorkService.doMultiplication();
        byte[] expectedResult = {2, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 2};

        Assert.assertArrayEquals(outputFilledArray, expectedResult);
    }
}