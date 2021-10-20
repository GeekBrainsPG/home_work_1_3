package service;

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

}
