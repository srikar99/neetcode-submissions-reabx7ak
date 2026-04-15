class Solution {
    public boolean confusingNumber(int n) {
        
        Map<Integer, Integer> map = Map.of(0, 0, 1, 1, 6, 9, 8, 8, 9, 6);

        int sum = 0;
        int m = n;

        while(n > 0) {
            int mod = n % 10;
            
            if(!map.containsKey(mod)) return false;

            sum = map.get(mod) + sum * 10;
            n /= 10;
        }
        
        return sum != m;
    }
}
