package arrays;

//CeilingOfTheGivenNumber is nothing but smalest element that is greater than or equal to the target number
public class CeilingOfTheGivenNumber {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 15, 23};
        int traget = 1;
        int result = findTheGreaterThanOrEqualToTarget(arr, traget);
        System.out.println(result);

    }

    private static int findTheGreaterThanOrEqualToTarget(int[] arr, int traget) {


        int start = 0;
        int end = arr.length - 1;
        if (traget > arr[end]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (traget == arr[mid]) {
                return arr[mid];
            }
            if (traget > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];

    }
}
