package arrays;

import java.util.Arrays;

public class FirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 7, 7, 8, 8, 10};
        int target = 7;
        int[] result = bSerch(array, target);
        System.out.println(Arrays.toString(result));

    }

    private static int[] bSerch(int[] array, int target) {
        int[] result = new int[2];
        int i = 0;
        int mid = 0;
        int j = array.length - 1;
        while (i <= j) {
            mid = i + (j - i) / 2;
            if (array[mid] == target) {
                if (array[mid - 1] == target) {
                    result[0] = mid - 1;
                    result[1] = mid;
                    return result;
                } else {
                    result[0] = mid;
                    result[1] = mid + 1;
                    return result;
                }


            } else if (target < array[mid]) {
                j = mid - 1;
            } else
                i = mid + 1;
        }
        result[0] = -1;
        result[1] = -1;
        return result;

    }
}
