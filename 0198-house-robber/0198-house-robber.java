class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
        return nums[0];
        if(nums.length==2)
        return Math.max(nums[0],nums[1]);
        int dp[]=new int[nums.length];
        dp[0]=nums[0];dp[1]=nums[1];dp[2]=dp[0]+nums[2];
        for(int i=3;i<dp.length;i++){
            dp[i]=nums[i]+Math.max(dp[i-3],dp[i-2]);
        }
        return Math.max(dp[nums.length-1],dp[nums.length-2]);
    }
}