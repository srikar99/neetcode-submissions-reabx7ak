class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = 0;
int currMax = 0;
        for(int num : nums) {
            

            if(num != 1) {
                max = Math.max(max, currMax);
                currMax = 0;
            } else {
                currMax++;
            }
        }

        return Math.max(currMax, max);
    }
}