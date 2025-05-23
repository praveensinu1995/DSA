package arrays;

public class SecondSmallestValue {
    public static void main(String[] args) {
        int [] array={-1,2,3,4,7,8,2,1};
        int result=secondSmallest(array);
        System.out.println("Second smallest "+result);
    }

    private static int secondSmallest(int[] array) {
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
                if (array[i]<smallest){
                    secondSmallest=smallest;
                    smallest=array[i];
                } else if (array[i]>smallest&&array[i]<secondSmallest) {
                    secondSmallest=array[i];
                }
        }
        return secondSmallest;
    }
}
