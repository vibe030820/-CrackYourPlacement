class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            int j;
            // Find the index of nums1[i] in nums2
            for (j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    break;
                }
            }
            // Find the next greater element
            int nextGreater = -1;
            for (int k = j + 1; k < nums2.length; k++) {
                if (nums2[k] > nums1[i]) {
                    nextGreater = nums2[k];
                    break;
                }
            }
            nums1[i] = nextGreater;
        }
        return nums1;
    }
}