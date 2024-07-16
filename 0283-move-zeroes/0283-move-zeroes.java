class Solution {
    public void moveZeroes(int[] nums) {
        int var1=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
            var1++;
           }
           else{ int temp=nums[i];
                    nums[i]=0;
                    nums[i-var1]=temp;
                    
                    }
            
                   
               
        }
    }
}