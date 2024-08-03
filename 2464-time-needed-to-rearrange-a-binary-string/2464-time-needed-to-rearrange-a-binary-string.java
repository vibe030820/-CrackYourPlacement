class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int c=0;
        while(!(s.indexOf("01")==-1)){
            c++;
            s=s.replaceAll("01","10");
        }
        return c;
    }
}