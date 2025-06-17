package arrays;

import java.util.Arrays;

public class SawpNumInArray {
    public static void main(String[] args) {
        int [] arr={15,3,7,10};
        int [] res=swap(arr,0,3);
        System.out.println(Arrays.toString(res));
    }

    private static int[] swap(int[] arr, int i, int j) {

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }
}
