class Solution {
    public int robbed(int[] num){
            if(num.length==1)
        return num[0];
        if(num.length==2)
        return Math.max(num[0],num[1]);
        int dp[]=new int[num.length];
        dp[0]=num[0];dp[1]=num[1];dp[2]=dp[0]+num[2];
        for(int i=3;i<dp.length;i++){
            dp[i]=num[i]+Math.max(dp[i-3],dp[i-2]);
        }
        return Math.max(dp[num.length-1],dp[num.length-2]);
        }
    public int rob(int[] nums) {
        // if(nums.length==1)
        // return nums[0];
        // if(nums.length==2)
        // return Math.max(nums[0],nums[1]);
        // if(nums.length==3)
        // return Math.max(nums[2],Math.max(nums[0],nums[1]));
        // int dp[]=new int[nums.length];
        // dp[0]=nums[0];dp[1]=nums[1];dp[2]=dp[0]+nums[2];
        // for(int i=3;i<dp.length;i++){
        //     if(((dp.length)-i-1)!=0)
        //     dp[i]=nums[i]+Math.max(dp[i-3],dp[i-2]);
        //     }
        // return Math.max(dp[nums.length-3],Math.max(dp[nums.length-1],dp[nums.length-2]));
        if(nums.length==1)
        return nums[0];
        if(nums.length==2)
        return Math.max(nums[0],nums[1]);
        int[] n1=new int[nums.length-1];
        int[] n2=new int[nums.length-1];
        int o=0,m=0;
        for(int j=0;j<nums.length;j++)
        {
         if(j!=nums.length-1)   
         n1[o++]=nums[j];
         if(j!=0)
         n2[m++]=nums[j];
        }
        return Math.max(robbed(n1),robbed(n2));
    }
}