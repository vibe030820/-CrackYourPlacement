
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1)
        return nums[0];
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double avg=(double)sum/k;
        double max=avg;
        for(int j=k;j<nums.length;j++){
            sum=sum-nums[j-k];
            sum=sum+nums[j];
            
            avg=(double)sum/k;
            max=Math.max(max,avg);
        }
        return max;
    }
}