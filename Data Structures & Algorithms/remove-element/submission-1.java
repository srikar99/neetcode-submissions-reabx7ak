class Solution {
    public int removeElement(int[] nums, int val) {
        
        int n = nums.length;
        int l = 0, r = n - 1, s = 0;
        int res = 0;

        while(l < r) {
            if(nums[l] == val) {
                while(nums[r] == val) {
                    r--;
                    s++;
                }
                
                int t = nums[l];
                nums[l] = nums[r];
                nums[r] = t;

                res++;
            }

            l++;
        }

        return (n - s + 1) - res;
    }
}