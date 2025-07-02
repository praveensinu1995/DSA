package arrays.TowDArray;

public class MaxWealth {

    public static void main(String[] args) {
        int [][] accounts={{1,2,9,10},{3,2,1}};
        int res=richestCust(accounts);
        System.out.println(res);
    }

    private static int richestCust(int[][] accounts) {
        int count =Integer.MIN_VALUE;
        if (accounts[0].length==0){
            return -1;
        }
        for (int person=0;person<accounts.length;person++){
            int tempCount=0;
            for (int account=0;account<accounts[person].length;account++){
                tempCount+=accounts[person][account];
            }
            if (tempCount>count){
                count=tempCount;
            }
        }
        return count;
    }
}
