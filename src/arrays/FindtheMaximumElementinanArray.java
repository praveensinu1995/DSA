package arrays;

public class FindtheMaximumElementinanArray {
    public static void main(String[] args) {
        int result=maxElement(new int[]{-1, -3, -5, -2});
        System.out.println("result :"+result);
    }

    public static int maxElement(int[] ints) {

        int result=Integer.MIN_VALUE;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]>result)
                result=ints[i];
        }
        return  result;
    }

}
