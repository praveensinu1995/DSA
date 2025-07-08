package arrays.TowDArray;

public class BinarySearchForInfinteArray {
    public static void main(String[] args) {
        int[] nums = {1, 3, 10, 4, 15, 17, 18, 20, 22, 24, 27, 28};
        int target = 28;
        BinarySearchForInfinteArray binarySearchForInfinteArray = new BinarySearchForInfinteArray();
        System.out.println(binarySearchForInfinteArray.ans(nums, target));
    }

    public int ans(int[] nums, int target) {
        int start = 0;
        int end = 1;
        while (target > nums[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;


        }
        return search(nums, target, start, end);
    }

    private int search(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else end = mid - 1;
        }
        return -1;
    }
}
