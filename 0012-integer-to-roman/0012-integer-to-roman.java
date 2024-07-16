class Solution {
    public String intToRoman(int num) {
        String r="";
        if(num/1000 > 0){
            int i=0;
            int n=num/1000;
            num =num % 1000;
            while(i<n){
                r+="M";
                i++;
            }
        }
        if(num>=900){
            r+="CM";
            num=num%100;
        }
       if(num/500 > 0 && num!=900){
            int i=0;
            int n=num/500;
            num =num - n*500;
            while(i<n){
                r+="D";
                i++;
            }
        }
        if(num>=400){
            r+="CD";
            num=num%100;
        }
       if(num/100 > 0 && num!=400){
            int i=0;
            int n=num/100;
            num=num%100;
            while(i<n){
                r+="C";
                i++;
            }
        }
        if(num>=90){
            r+="XC";
            num=num%10;
        }
        if(num/50 > 0 && num!=90){
            int i=0;
            int n=num/50;
            num =num - n*50;
            while(i<n){
                r+="L";
                i++;
            }
        }
        if(num>=40){
            r+="XL";
            num=num%10;
        }
      if(num/10 > 0 && num!=40){
            int i=0;
            int n=num/10;
            num=num%10;
            while(i<n){
                r+="X";
                i++;
            }
        }
        if(num==9){
            r+="IX";
            // num=num%5;
            num=0;
        }

       if(num/5 > 0 &&num!=9){
            int i=0;
            int n=num/5;
            num =num - n*5;
            while(i<n){
                r+="V";
                i++;
            }
        }
        if(num>=4){
            r+="IV";
            
        } 
        if(num/1 > 0 && num!=4){
            int i=0;
            int n=num/1;
            
            while(i<n){
                r+="I";
                i++;
            }
        }
        return r;
    }
}