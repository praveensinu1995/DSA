package arrays;

public class LinerSearch {
    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 7, 1, 3};
        int target =1;
        int result = lSearch(array, target);
        System.out.println(result);
    }

    private static int lSearch(int[] array, int target) {
        int result = -1;
        int i = 0;
        int j = array.length - 1;
        while (i <= j) {
            if (array[i] == target) {
                result = i;
                break;
            } else if (array[j] == target) {
                result = j;
                break;
            }
            i++;
            j--;
        }
        return result;
    }
}
