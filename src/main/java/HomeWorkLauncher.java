import model.MinMaxValue;
import service.HomeWorkService;

import java.util.Arrays;

public class HomeWorkLauncher {

    public static void main(String[] args) {
        // 1 task
        byte[] bytes = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        byte[] result = HomeWorkService.flipBinaryArray(bytes);

        System.out.println(Arrays.toString(result));

        //2 task
        result = HomeWorkService.fillEmptyArray();

        System.out.println(Arrays.toString(result));

        //3 task
        result = HomeWorkService.doMultiplication();

        System.out.println(Arrays.toString(result));

        int[][] matrix = HomeWorkService.createQuadraticMatrix(0);
        System.out.println(Arrays.deepToString(matrix));

        int[] array = HomeWorkService.createArrayAndFill(10, 7);
        System.out.println(Arrays.toString(array));

        MinMaxValue minMaxValue = HomeWorkService.findMinMaxValueInArray(new int[] {1, -5, 60, 4, -7, 100});
        System.out.println(minMaxValue);

        boolean isEqualPartsExist = HomeWorkService.checkBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1});
        System.out.println(isEqualPartsExist);

        int[] shiftedArray = HomeWorkService.shiftElementInArray(new int[] {1, 2, 3 }, -1);
        System.out.println(Arrays.toString(shiftedArray));
    }

}
