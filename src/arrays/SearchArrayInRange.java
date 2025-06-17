package arrays;

public class SearchArrayInRange {
    public static void main(String[] args) {
        int[] arr={3,3,1,5,7,9,34};
        int start=1;
        int end=3;
        int traget=33;
        int index=searchInRange(arr,start,end,traget);
        System.out.println("index of an array is "+index);
    }

    private static int searchInRange(int[] arr, int start, int end,int traget) {

        if (arr.length==0 || start>end){
            return -1;
        }
        for (int intial = start; intial<=end; intial++){
            if (arr[intial]==traget){
                return intial;
            }
        }
        //if not found
        return -1;
    }
}
