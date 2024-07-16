class Solution {
    public String decodeString(String s) {
        if(!(s.contains("[")))
        return s;
        int var1=0,var2=0;
        int n=0;
        String c="";
        String st="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='[')
            var1=i;
            else if(s.charAt(i)==']')
            {
                var2=i;
                break;
            }
        }
        // if(var1-3>=0){
        //     if(Character.isDigit(s.charAt(var1-3)))
        //      n=Integer.parseInt(s.substring(var1-3,var1));
        //      }
        // else if((var1-2)>=0){
        //     if(Character.isDigit(s.charAt(var1-2)))
        //      n=Integer.parseInt(s.substring(var1-2,var1));

        // }
        
        // else if(var1-1>=0){
        //      n=Integer.parseInt(s.substring(var1-1,var1));}
        int digitStart = var1 - 1;
        while (digitStart >= 0 && Character.isDigit(s.charAt(digitStart))) {
            digitStart--;
        }
        digitStart++;

        if (digitStart >= 0 && digitStart < var1) {
            n = Integer.parseInt(s.substring(digitStart, var1));
        }
        for(int j=0;j<n;j++){
            st=st+s.substring(var1+1,var2);
        }
        if(var1-1>=0)
        c=s.substring(0,digitStart)+st+s.substring(var2+1);
        if (c.contains("[")) {
            return decodeString(c);
        } 
            return c;
        
    }
}