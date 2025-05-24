package arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int result = secondLargest(new int[]{1, 1,1, 1});
        System.out.println(result);
    }

    public static int secondLargest(int[] ints) {
        int largest = ints[0];
        int sLargest = Integer.MIN_VALUE;
        if (ints.length > 1) {
            for (int i = 1; i < ints.length; i++) {
                if (largest < ints[i]) {
                    sLargest = largest;
                    largest = ints[i];
                } else if (ints[i] > sLargest && ints[i] < largest) {
                    sLargest = ints[i];
                }
            }
        } else sLargest = largest;
        if (sLargest == Integer.MIN_VALUE) {
            return largest;
        }
        return sLargest;
    }
}
