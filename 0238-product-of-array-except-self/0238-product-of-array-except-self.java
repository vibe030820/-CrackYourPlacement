class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int p=1;
    boolean zero=false;
    int zeroes=0;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]!=0)
        p=p*nums[i];
        else if(nums[i]==0){
        zero=true;
        zeroes++;
        }
    }
    for(int i=0;i<nums.length;i++)
    {
        if(zero){
            if((nums[i])!=0)
            nums[i]=0;
            else if(zeroes==1)
            nums[i]=p;
            else
            nums[i]=0;
        }
        else
        nums[i]=p/nums[i];
    }
    return nums;
    }
}