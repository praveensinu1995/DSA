package arrays;

public class MaxValueInRange {
    public static void main(String[] args) {
        int [] arr={5,-3,-9,-1,3};
        int res=maxRange(arr,5,3);
        System.out.println("Max value with in the range is :"+res);
    }

    private static int maxRange(int[] arr, int start, int end) {

        if (start>end){
            return -1;
        } else if (arr.length==0) {
            return -1;
        }

        int result=Integer.MIN_VALUE;

        for (int i=start;i<=end;i++){
            if (arr[i]>result){
                result=arr[i];
            }
        }
        return result;

    }
}
