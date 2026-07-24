class Solution {
    public int maxArea(int[] heights) {
        
        int left = 0, right = heights.length - 1;
        int maxArea = 0;

        while(left <= right) {
            int small = Math.min(heights[left], heights[right]) * (right - left);

            maxArea = Math.max(maxArea, small);

            if(left <= right) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
