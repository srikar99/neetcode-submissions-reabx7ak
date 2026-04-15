class Node {
    int key;
    int value;
    Node prev;
    Node next;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {

    private Map<Integer, Node> cache;
    private int capacity;
    private Node left;
    private Node right;

    public LRUCache(int capacity) {
        this.cache = new HashMap<>(capacity);
        this.capacity = capacity;
        this.left = new Node(0, 0);    
        this.right = new Node(0, 0);
        this.left.next = this.right;
        this.right.prev = this.left;
    }
    

    private void insert(Node node) {
        Node prev = this.right.prev;
        prev.next = node;
        node.prev = prev;
        node.next = this.right;
        this.right.prev = node;

    }

    private void remove(Node node) {
        
        Node prev = node.prev;
        Node next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    public int get(int key) {
        
        if(cache.containsKey(key)) {
            Node node = cache.get(key);
            remove(node);
            insert(node);

            return node.value;
        }

        return -1;
    }
    
    public void put(int key, int value) {
        
        if(cache.containsKey(key)) {
            Node existingNode = cache.get(key);
            remove(existingNode);
        }

        Node node = new Node(key, value);
        cache.put(key, node);
        insert(node);

        if(this.capacity < cache.size()) {
            Node lru = this.left.next;
            remove(lru);
            cache.remove(lru.key);

        }
    }
}
