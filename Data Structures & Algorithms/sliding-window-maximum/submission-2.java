class Node {
    int value;
    int index;

    Node(int value, int index) {
        this.value = value;
        this.index = index;
    }
}

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;

        PriorityQueue<Node> heap = new PriorityQueue<>((a, b) -> b.value - a.value);
        int j = 0;
        int[] res = new int[n - k + 1];

        for(int i = 0; i < n; i++) {
            heap.offer(new Node(nums[i], i));

            if(i >= k - 1) {
                while(heap.peek().index <= i - k) {
                    heap.poll();
                }

                res[j++] = heap.peek().value;
            }
        }
        
        return res;
    }
}
