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
}