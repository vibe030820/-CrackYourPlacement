class Solution {
    public void sortColors(int[] nums) {
        int a1=0;int a2=0;int a3=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            a1++;
            else if(nums[i]==1)
            a2++;
            else if(nums[i]==2)
            a3++;           
        }
        for(int i=0;i<a1+a2+a3;i++){
            if(i<a1)
            nums[i]=0;
            else if(i>=a1 && i<a1+a2)
            nums[i]=1;
            else if(i>=a2+a1 && i<a2+a1+a3)
            nums[i]=2;
        }
    }
}