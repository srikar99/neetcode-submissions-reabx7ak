class Node {
    int key;
    int value;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class MyHashMap {
    
    List<Node> map;

    public MyHashMap() {
        this.map = new ArrayList<>();    
    }
    
    public void put(int key, int value) {
        remove(key);

        Node node = new Node(key, value);
        map.add(node);
    }
    
    public int get(int key) {
        for(Node node : map) {
            if(node.key == key) {
                return node.value;
            }
        }

        return -1;
    }
    
    public void remove(int key) {
        for(int i = 0; i < map.size(); i++) {
            if(map.get(i).key == key) {
                map.remove(i);
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */