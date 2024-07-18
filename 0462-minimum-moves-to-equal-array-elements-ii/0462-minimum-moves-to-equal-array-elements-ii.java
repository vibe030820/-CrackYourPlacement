class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=0;
        int m=0;
        if(nums.length%2==0)
        mid=nums.length/2;
        else
        mid=(nums.length-1)/2;

        for(int i=0;i<nums.length;i++){
            m+=Math.abs(nums[i]-nums[mid]);
        }
        return m;
    }
}