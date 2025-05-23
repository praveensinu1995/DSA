package arrays;

public class SecondLargestNumINArray {

    public static void main(String[] args) {
        int [] array={9,2,3,4,7,8,2,1};
        int result=secondLargest(array);
        System.out.println("Second largest "+result);
    }

    private static int secondLargest(int[] array) {
        int largest=Integer.MIN_VALUE;
        int sLargest=Integer.MIN_VALUE;
        for(int i=0;i<array.length-1;i++){
            if (array[i]>largest){
                sLargest=largest;
                largest=array[i];
            } else if (array[i]<largest &&array[i]>sLargest) {
                sLargest=array[i];
            }
        }
        return sLargest;
    }
}
