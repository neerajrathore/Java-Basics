package OverridingHashMap;

import java.util.HashMap;

public class OvHashMap {


    public static void main(String[] args) {


    }

}

// need to create a hashmap class and manage linked list there
class Map {

}


class K{
    String key;
    K(String key){
       this.key = key;
    }
    @Override
    public int hashCode() {
        return (int)key.charAt(0);
    }
}

class Node {
    int hash;
    K key;
    int value;
    Node next;

    public Node(K key, int value) {
        this.hash = key.hashCode();
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
