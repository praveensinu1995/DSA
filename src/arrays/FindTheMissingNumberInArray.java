package arrays;

public class FindTheMissingNumberInArray {
    public static void main(String[] args) {

        int missingNumber = missingNo(new int[]{1, 2, 4, 6, 3, 7, 8});
        System.out.println(missingNumber);
    }

    private static int missingNo(int[] ints) {
        int maxNo = ints.length+1;
        int totalSum = 0;
        for (int i = 0; i < ints.length; i++) {
            totalSum += ints[i];
        }
        int formual = maxNo * (maxNo + 1) / 2;
        int result = formual - totalSum;
        return result;
    }
}
