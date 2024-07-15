class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] t=s.split("\\s+");
        String p="";
        for(int i=t.length-1;i>=0;i--){
            
            p+=t[i];
            if(i>0)p+=" ";
        }
        return p;
    }
}