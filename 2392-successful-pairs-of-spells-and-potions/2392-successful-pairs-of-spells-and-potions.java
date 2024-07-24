class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int pm=0,mid=0;
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int start=0,c=0,end=potions.length-1;
            while(start <= end){
              
                mid=start + (end - start) / 2;
            pm=potions[mid];
            if((long)pm*spells[i]>=success)
            {
                c=potions.length-mid;
                end=mid-1;
            }
            else if(pm*spells[i]<success)
                start=mid+1;
            }
            spells[i]=c;
        
        
        
        }
        return spells;
    }
}