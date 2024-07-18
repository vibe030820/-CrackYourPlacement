class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm =new HashMap<>();
        ArrayList<Integer> l= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            Integer n=hm.get(nums[i]);
            if(n==null)
            hm.put(nums[i],1);
            else if(n==1)
            l.add(nums[i]);
            else
            hm.put(nums[i],n+1);
            
            
        }
        return l;
    }
}