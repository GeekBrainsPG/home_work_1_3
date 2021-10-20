package service;

import junit.framework.TestCase;
import org.junit.Assert;

public class HomeWorkServiceTest extends TestCase {

    public void testFlipBinaryArray() {
        byte[] inputByteArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        byte[] outputByteArray = {0, 0, 1, 1, 0, 1, 0, 0, 1, 1};

        Assert.assertArrayEquals(HomeWorkService.flipBinaryArray(inputByteArray), outputByteArray);
    }
}