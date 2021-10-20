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

}
