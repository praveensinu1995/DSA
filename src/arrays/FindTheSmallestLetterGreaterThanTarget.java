package arrays;

//return the smallest char that is larger than the give n target
//if traget is z and letter={a,b} than return the first char
public class FindTheSmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c'};
        char target = 'b';
        char result = findTheSmallestLetterGreaterThanTarget(arr, target);
        System.out.println(result);
    }

    private static char findTheSmallestLetterGreaterThanTarget(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start % arr.length];
    }
}
