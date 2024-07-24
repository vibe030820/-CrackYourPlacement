class Solution {
    public int maxArea(int[] height) 
    {
        int lp=0,rp=height.length-1,w=0,max=0;
        while(lp<rp)
        {
            w=(Math.min(height[lp],height[rp]))*(rp-lp);
            max=Math.max(w,max);
            if(height[lp]<height[rp])
            lp++;
            else if(height[lp]>=height[rp])
            rp--;
        }
       return max;
    }
}