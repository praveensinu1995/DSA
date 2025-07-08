package arrays;

//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//Example 1:
//
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:
//
//Input: nums = [1,3,5,6], target = 2
//Output: 1
public class SearchInsertPosition {

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition=new SearchInsertPosition();
        int []nums={1,3,5,6};
        int target=7;
        int res=searchInsertPosition.searchInsert(nums,target);
        System.out.println(res);
    }

    private int searchInsert(int[] nums, int target) {

        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target==nums[mid]){
                return mid;
            } else if (target>nums[mid]) {
                start=mid+1;
            }else end=mid-1;
        }
        return start;
    }
}
