package arrays;

public class LargestNumInArray {


    public int largestElement(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int result = nums[0];
        while (i <= j) {
            if (nums[i] > result) {
                result = nums[i];
            }
            if (nums[j] > result) {
                result = nums[j];
            }
            i++;
            j--;
        }
        return result;
    }

    public static void main(String[] args) {
        LargestNumInArray largestNumInArray = new LargestNumInArray();
        int[] array = {3, 3, 6, 1};
        int result = largestNumInArray.largestElement(array);
        System.out.println(result);
    }

}
