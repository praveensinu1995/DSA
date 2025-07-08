package numebrsProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 6, 2};
        sotrt(nums);
        Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("===============================");
        System.out.println(Arrays.toString(nums));
    }

    private static void sotrt(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] >nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
