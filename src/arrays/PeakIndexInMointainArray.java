package arrays;

public class PeakIndexInMointainArray {

    public static void main(String[] args) {
        int [] nums={6,4,3,1};
        PeakIndexInMointainArray peakIndexInMointainArray=new PeakIndexInMointainArray();
        int res=peakIndexInMointainArray.findPeak(nums);
        System.out.println(res);
    }

    private int findPeak(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while (start<end){
            int mid=start+(end-start)/2;//3
            if (nums[mid]>nums[mid+1]){//5>6
                end=mid;
            } else
                start=mid+1;//start=4
        }
        return start;
    }
}
