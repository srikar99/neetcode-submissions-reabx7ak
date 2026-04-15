class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int n = nums2.length;
        int[] res = new int[nums1.length];

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
            res[i] = -1;
        }
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() && nums2[i] > stack.peek()) {
                res[map.get(stack.pop())] = nums2[i];
            }

            if(map.containsKey(nums2[i])) {
                stack.push(nums2[i]);
            }
        }

        return res;
    }
}