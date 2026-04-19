class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        double sum = 0;
        for(int num : people) {
            sum += num;
        }

        double ans = sum / (double) limit;

        return (int) Math.ceil(ans);
    }
}