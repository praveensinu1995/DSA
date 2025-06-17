package arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 7, 9, 11};
        int target = 10;
        int result = bSearch(array, target);
        System.out.println("result :" + result);
    }

    private static int bSearch(int[] array, int target) {
        int i = 0;
        int mid = 0;
        int j = array.length - 1;
        while (i <= j) {
            mid = i + (j - i) / 2;
            if (target == array[mid]) {
               return mid;
            }else if (target <  array[mid]) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }
}
