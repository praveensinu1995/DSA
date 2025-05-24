package arrays;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {

        int [] result=reversAnArray(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(result));
    }

    private static int[] reversAnArray(int[] ints) {


        int i=0;
        int j=ints.length-1;
        while (i<j){
            int temp=ints[i];
            ints[i]=ints[j];
            ints[j]=temp;
            i++;j--;
        }
        return  ints;
    }
}
