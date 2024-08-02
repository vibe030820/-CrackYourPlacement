class Solution {
    public int minimumDeletions(String s) {
        int[] a=new int[s.length()];
        int b=0,del=0;
        int ans=s.length();
        a[s.length()-1]=0;
        for(int i=s.length()-2;i>=0;i--)
        {
            if(s.charAt(i+1)=='a')
            a[i]=a[i+1]+1;
            else
            a[i]=a[i+1];

        }
        for(int i=0;i<s.length();i++)
        {
        del=a[i]+b;
        ans=Math.min(ans,del);
        if(s.charAt(i)=='b')
        b++;
        }
        return ans;
        }
}