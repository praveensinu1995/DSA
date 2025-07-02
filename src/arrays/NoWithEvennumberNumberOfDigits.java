package arrays;

public class NoWithEvennumberNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {-12,4,66,-789, -36};

        int res = countEvenDigitsNo(arr);
        System.out.println("result :"+res);
    }

    private static int countEvenDigitsNo(int[] arr) {
        if (arr.length == 0) {
            return -1;

        }
        int count = 0;
        for (int num : arr) {
            if (evenDigits(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean evenDigits(int num) {
        int count=0;
        if (num<0){
            num*=-1;
        }
        while (num>0){
            count++;
            num=num/10;
        }
        if(count%2==0 &&count>1){
            return  true;
        }

        return false;
    }
}
