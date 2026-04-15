class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[n];

        for(int i = 0; i < n; i++) {
            map.put(nums1[i], i);
            res[i] = -1;
        }

        Deque<Integer> stack = new ArrayDeque<>();

        for(int num : nums2) {

            while(!stack.isEmpty() && num > stack.peek()) {
                int val = stack.pop();
                int idx = map.get(val);

                res[idx] = num;
            }

            if(map.containsKey(num)) {
                stack.push(num);
            }
        }

        return res;
    }
}