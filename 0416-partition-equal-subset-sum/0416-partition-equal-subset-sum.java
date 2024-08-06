class Solution {
     static boolean subsetSumToK(int n, int k, int[] arr) {
            boolean dp[][] = new boolean[n][k + 1];
        
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        if (arr[0] <= k) {
            dp[0][arr[0]] = true;
        }

        for (int ind = 1; ind < n; ind++) {
            for (int target = 1; target <= k; target++) {
                boolean notTaken = dp[ind - 1][target];
                
                boolean taken = false;
                if (arr[ind] <= target) {
                    taken = dp[ind - 1][target - arr[ind]];
                }
                
                dp[ind][target] = notTaken || taken;
            }
        }

        return dp[n - 1][k];
        }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        if(sum%2!=0)
        return false;
        else 
        {
        return subsetSumToK(nums.length,sum/2,nums);
        }
    }
}