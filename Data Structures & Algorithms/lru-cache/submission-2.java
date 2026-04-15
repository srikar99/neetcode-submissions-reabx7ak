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

    Map<Integer, Node> cache;
    int capacity;
    Node prev;
    Node next;

    public LRUCache(int capacity) {
        this.cache = new HashMap<>();
        this.capacity = capacity;
        this.prev = new Node(0, 0);
        this.next = new Node(0, 0);

        this.prev.next = next;
        this.next.prev = prev;
    }

    void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;

        prev.next = next;
        next.prev = prev;
    }
    
    void insert(Node node) {
        Node prev = this.next.prev;
        prev.next = node;
        node.next = this.next;
        node.prev = prev;
        this.next.prev = node;
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
            remove(cache.get(key));
        }

        Node node = new Node(key, value);
        this.cache.put(key, node);
        insert(node);

        if(this.capacity < cache.size()) {
            Node lru = this.prev.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}
