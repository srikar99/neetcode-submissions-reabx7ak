class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int n = nums2.length;
        int[] res = new int[nums1.length];

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
            res[i] = -1;
        }

        for(int i = 0; i < n; i++) {
            if(!map.containsKey(nums2[i])) continue;

            for(int j = i + 1; j < n; j++) {
                if(nums2[j] > nums2[i]) {
                    res[map.get(nums2[i])] = nums2[j];
                    break;
                }
            }
        }

        return res;
    }
}