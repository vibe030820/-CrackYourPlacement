class Solution {
    public int climbStairs(int n) {
        int a[]=new int[n+1];
        a[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1)
            a[i]=a[i-1]+0;
            else
            a[i]=a[i-1]+a[i-2];
        }
        return a[n];
    }
}