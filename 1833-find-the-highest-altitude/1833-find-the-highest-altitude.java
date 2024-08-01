class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        max=Math.max(max,gain[0]);
        for(int i=1;i<gain.length;i++){
            gain[i]=gain[i]+gain[i-1];
            max=Math.max(max,gain[i]);
        }
        return max;
    }
}