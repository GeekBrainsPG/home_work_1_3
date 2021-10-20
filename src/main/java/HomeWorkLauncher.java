import service.HomeWorkService;

import java.util.Arrays;

public class HomeWorkLauncher {

    public static void main(String[] args) {
        // 1 task
        byte[] bytes = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        byte[] result = HomeWorkService.flipBinaryArray(bytes);

        System.out.println(Arrays.toString(result));

        //2 task
    }

}
