package service;

import model.MinMaxValue;

import java.util.Arrays;

public class HomeWorkService {

    private HomeWorkService() {}

    public static byte[] flipBinaryArray(byte[] bytes) {
        byte [] immutableBytes = new byte[bytes.length];

        for (int i = 0; i < bytes.length; i++) {
            immutableBytes[i] = (byte) Math.abs(bytes[i] - 1);
        }

        return immutableBytes;
    }

    public static byte[] fillEmptyArray() {
        byte[] emptyArray = new byte[100];

        for (byte i = 0; i < 100; i++) {
            emptyArray[i] = (byte) (i + 1);
        }

        return emptyArray;
    }

    public static byte[] doMultiplication() {
        byte[] array = new byte[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (byte i = 0; i < array.length; i++) {
            byte element = array[i];

            if (element < 6) {
                array[i] *= 2;
            }
        }

        return array;
    }

    public static int[][] createQuadraticMatrix(int matrixSize) {
        int[][] matrix = new int[matrixSize][matrixSize];

        fillDiagonal(matrix);

        return matrix;
    }

    public static int[] createArrayAndFill(int len, int initialValue) {
        int[] array = new int[len];

        Arrays.fill(array, initialValue);

        return array;
    }

    public static MinMaxValue findMinMaxValueInArray(int[] array) {
        MinMaxValue minMaxValue = new MinMaxValue();

        for (int j : array) {
            if (minMaxValue.getMax() < j) {
                minMaxValue.setMax(j);
            }

            if (minMaxValue.getMin() > j) {
                minMaxValue.setMin(j);
            }
        }

        return minMaxValue;
    }

    public static boolean checkBalance(int[] array) {
        boolean isEqualPartsExist = false;

        for (int divider = 1; divider < array.length - 1; divider++) {
            int[] leftPart = Arrays.copyOfRange(array, 0, divider);
            int[] rightPart = Arrays.copyOfRange(array, divider, array.length);
            int leftPartSum = findSumOfIntInArray(leftPart);
            int rightPartSum = findSumOfIntInArray(rightPart);

            if (leftPartSum == rightPartSum) {
                isEqualPartsExist = true;
            }
        }

        return isEqualPartsExist;
    }

    public static int[] shiftElementInArray(int[] array, int n) {
        if (n == 0) {
            return array;
        }

        if (n > 0) {
            return shiftRight(array, n);
        }

        return shiftLeft(array, n);
    }

    private static int[] shiftRight(int[] array, int n) {
        int i = 0;

        while (i < n) {
            int firstElementToShift = array[0];

            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }

            array[array.length - 1] = firstElementToShift;
            i++;
        }

        return array;
    }

    private static int[] shiftLeft(int[] array, int n) {
        int i = 0;

        while (i < Math.abs(n)) {
            int lastElementToShift = array[array.length - 1];

            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }

            array[0] = lastElementToShift;
            i++;
        }

        return array;
    }

    private static int findSumOfIntInArray(int[] array) {
        return Arrays.stream(array).sum();
    }

    private static void fillDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int rightIndex = (matrix[i].length - 1) - j;
                matrix[i][j] = 1;
                matrix[i][rightIndex] = 1;

                break;
            }
        }
    }

}
