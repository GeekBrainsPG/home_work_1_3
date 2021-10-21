package service;

import junit.framework.TestCase;
import model.MinMaxValue;
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

    public void testCreateQuadraticMatrixWithOddSize() {
        int[][] matrix = HomeWorkService.createQuadraticMatrix(5);
        int[][] expectedMatrix = new int[][] {
                {1, 0, 0, 0, 1},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {1, 0, 0, 0, 1}
        };

        Assert.assertArrayEquals(matrix, expectedMatrix);
    }

    public void testCreateQuadraticMatrixWithEvenSize() {
        int[][] matrix = HomeWorkService.createQuadraticMatrix(4);
        int[][] expectedMatrix = new int[][] {
                {1, 0, 0, 1},
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {1, 0, 0, 1},
        };

        Assert.assertArrayEquals(matrix, expectedMatrix);
    }

    public void testCreateQuadraticMatrix1X1() {
        int[][] matrix = HomeWorkService.createQuadraticMatrix(1);
        int[][] expectedMatrix = new int[][] {{1}};

        Assert.assertArrayEquals(matrix, expectedMatrix);
    }

    public void testCreateQuadraticMatrix0Size() {
        int[][] matrix = HomeWorkService.createQuadraticMatrix(0);
        int[][] expectedMatrix = new int[][] {};

        Assert.assertArrayEquals(matrix, expectedMatrix);
    }


    public void testCreateArrayAndFill() {
        int[] array = HomeWorkService.createArrayAndFill(10, 7);
        int[] expectedArray = new int[] {7, 7, 7, 7, 7, 7, 7, 7, 7, 7};

        Assert.assertArrayEquals(array, expectedArray);
    }

    public void testFindMinMaxValueInArray() {
        MinMaxValue values = HomeWorkService.findMinMaxValueInArray(new int[] {1, -5, 60, 4, -7, 100});
        MinMaxValue expectedResult = new MinMaxValue(-7, 100);

        assertEquals(values, expectedResult);
    }

    public void testFindMinMaxValueInArrayWithSingleInt() {
        MinMaxValue values = HomeWorkService.findMinMaxValueInArray(new int[] {-1});
        MinMaxValue expectedResult = new MinMaxValue(-1, -1);

        assertEquals(values, expectedResult);
    }

    public void testCheckBalanceShouldBeTrue1() {
        boolean isEqualPartsExist = HomeWorkService.checkBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1});

        assertTrue(isEqualPartsExist);
    }

    public void testCheckBalanceShouldBeTrue2() {
        boolean isEqualPartsExist = HomeWorkService.checkBalance(new int[]{1, 1, 1, 2, 1});

        assertTrue(isEqualPartsExist);
    }

    public void testCheckBalanceShouldBeFalse() {
        boolean isEqualPartsExist = HomeWorkService.checkBalance(new int[]{1, 1, 1});

        assertFalse(isEqualPartsExist);
    }

    public void testShiftElementInArrayWithRightShift() {
        int[] shiftedArray = HomeWorkService.shiftElementInArray(new int[] {1, 2, 3 }, 1);
        int[] expectedArray = new int[] {2, 3, 1};

        Assert.assertArrayEquals(shiftedArray, expectedArray);
    }

    public void testShiftElementInArrayWithRightShift1() {
        int[] shiftedArray = HomeWorkService.shiftElementInArray(new int[] {1, 2, 3 }, 4);
        int[] expectedArray = new int[] {2, 3, 1};

        Assert.assertArrayEquals(shiftedArray, expectedArray);
    }

    public void testShiftElementInArrayWithoutRightShift() {
        int[] shiftedArray = HomeWorkService.shiftElementInArray(new int[] {1, 2, 3 }, 3);
        int[] expectedArray = new int[] {1, 2, 3};

        Assert.assertArrayEquals(shiftedArray, expectedArray);
    }

    public void testShiftElementInArrayWithLeftShift() {
        int[] shiftedArray = HomeWorkService.shiftElementInArray(new int[] {1, 2, 3 }, -1);
        int[] expectedArray = new int[] {3, 1, 2};

        Assert.assertArrayEquals(shiftedArray, expectedArray);
    }

    public void testShiftElementInArrayWithLeftShift1() {
        int[] shiftedArray = HomeWorkService.shiftElementInArray(new int[] {1, 2, 3 }, -4);
        int[] expectedArray = new int[] {3, 1, 2};

        Assert.assertArrayEquals(shiftedArray, expectedArray);
    }

    public void testShiftElementInArrayWithoutLeftShift() {
        int[] shiftedArray = HomeWorkService.shiftElementInArray(new int[] {1, 2, 3 }, -3);
        int[] expectedArray = new int[] {1, 2, 3};

        Assert.assertArrayEquals(shiftedArray, expectedArray);
    }
}