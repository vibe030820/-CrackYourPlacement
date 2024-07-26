class Solution 
{
     boolean calculatetotalhours(int k,int[] piles,int h)
        {
        long total_hours=0;
        for(int i:piles)
        {
            total_hours+=i/k;
            if(i%k!=0)
            {
                total_hours++;
            }
        }
        if(total_hours>h)
          return false;
        return true;
    }

    public int minEatingSpeed(int[] piles, int h) 
    {
        int sum=0;
        Arrays.sort(piles);
        for(int i=0;i<piles.length;i++){
            sum+=piles[i];
        }
        int s=1;
        int e=piles[piles.length-1];
        int mid=0;
        while(s<=e){
            mid=s+(e-s)/2;
            if(calculatetotalhours(mid,piles,h))
            e=mid-1;
            else
            s=mid+1;
        }
        return s;
    }
}