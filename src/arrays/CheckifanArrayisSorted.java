package arrays;

public class CheckifanArrayisSorted {
    public static void main(String[] args) {
        boolean result = checkifanArrayisSorted(new int[]{1, 5, 3, 5, 7});
        System.out.println(result);
    }

    private static boolean checkifanArrayisSorted(int[] ints) {
        boolean result = true;
        if (ints.length > 1) {
            for (int i = 1; i < ints.length ; i++) {
                if (ints[i] < ints[i-1]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
