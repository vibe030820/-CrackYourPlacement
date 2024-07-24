class Solution
{
    public int maxOperations(int[] nums, int k) 
    {
        // int p1=0,p2=0,d=0,c=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     p1=nums[i];
        //     d=i;
        //     while(d<nums.length-1)
        //     {
        //     p2=nums[d+1];
        //     if(p1+p2==k && p1!=0 && p2!=0)
        //     {
        //         c++;
        //     nums[i]=0;
        //     nums[d+1]=0;
        //     break;
        //     }
        //     else
        //     d++;
        //     }
        // }
        // return c;
        int c=0;
        Arrays.sort(nums);
        int lp=0,rp=nums.length-1;
        while(lp<rp)
        {
            if(nums[lp]+nums[rp]==k)
            {
            c++;
            nums[lp]=0;
            nums[rp]=0;
            lp++;
            rp--;
            }
            else if(nums[lp]+nums[rp]>k)
            rp--;
            else if(nums[lp]+nums[rp]<k)
            lp++;
            
        }
        return c;
    }
}