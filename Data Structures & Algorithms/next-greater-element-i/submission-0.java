class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] nextGreater = new int[nums2.length];
        int r = nums2.length - 1;
        nextGreater[r] = -1;

        for(int i = nums2.length - 2; i >= 0; i--) {
            
            if(nums2[i] >= nums2[r]) {
                nextGreater[i] = -1;
                r--;
            } else {
                nextGreater[i] = nums2[r];
                r--;
            }
        }



        int[] res = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++) {
            for(int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    res[i] = nextGreater[j];
                }
            }
        }

        return res;
    }
}