class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) 
    {
        int t=0;
        for(int i=0;i<timeSeries.length;i++)
        {
            if(i+1<timeSeries.length)
            {
        if(timeSeries[i]+duration<=timeSeries[i+1])
        t+=duration;
        else
        t+=timeSeries[i+1]-timeSeries[i];
            }
            else
            t+=duration;
        }
        return t;
    }
}