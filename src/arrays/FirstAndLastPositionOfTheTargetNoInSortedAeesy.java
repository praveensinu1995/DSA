package arrays;

import java.util.Arrays;

public class FirstAndLastPositionOfTheTargetNoInSortedAeesy {

    public static void main(String[] args) {
        int[] arr = {2, 7, 7, 7, 7, 7, 8, 8, 9};
        int target = 7;
        int res[] = new int[2];
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        res[0]=start;res[1]=end;
        System.out.println(Arrays.toString(res));

    }

    private static int search(int[] arr, int target, boolean findFirst) {
        int ans=-1;
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if (target==arr[mid]){
                ans=mid;
                if (findFirst){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            else if (target>arr[mid]){
                start=mid+1;
            } else  {
                end=mid-1;
            }
        }
        return ans;
    }
}
