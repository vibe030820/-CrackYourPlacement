class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long prefixSum=0,totalSum=0;
        for(int i=0;i<n;i++)
            totalSum+=nums[i];
        int validSplits=0;
        for(int i=0;i<n-1;i++)
        {
            prefixSum+=nums[i];
            if(prefixSum>=totalSum-prefixSum)
                validSplits++;
        }
        return validSplits;
    }
}