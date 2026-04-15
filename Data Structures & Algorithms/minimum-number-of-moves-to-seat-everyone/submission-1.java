class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        
        int n = seats.length;
        int max = 0;

        for(int s : seats) {
            max = Math.max(max, s);
        }

        for(int s : students) {
            max = Math.max(max, s);
        }

        int[] seatArr = new int[max + 1];
        int[] studentArr = new int[max + 1];
        int res = 0;

        for(int i = 0; i < n; i++) {
            seatArr[seats[i]]++;
            studentArr[students[i]]++;
        }

        int i = 0, j = 0;

        while(n > 0) {
            if(seatArr[i] == 0) {
                i++;
                continue;
            }
            if(studentArr[j] == 0) {
                j++;
                continue;
            }

            res += Math.abs(i - j);
            seatArr[i]--;
            studentArr[j]--;
            n--;
        }

        return res;
    }
}