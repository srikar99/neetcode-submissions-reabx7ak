class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int[] res = new int[nums.length];
        int odd = 0;

        for(int num : nums) {
            if(num % 2 != 0) odd++;
        }
        
        int i = 0, j = nums.length - odd;

        for(int num : nums) {
            if(num % 2 == 0) res[i++] = num;
            else res[j++] = num;
        }

        return res;
    }
}