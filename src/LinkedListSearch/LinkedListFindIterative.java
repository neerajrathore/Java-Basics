package LinkedListSearch;

public class LinkedListFindIterative {
    static Node head, tail = null;
    public static void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        else {
            head.next = newNode;
            tail = newNode;
        }
    }
    public void deleteNode () {
        addNode(4);
    }
    public static void  display (){
        Node current = head;
        while (head == null){
            return;
        }
        while (current != null){
            System.out.println(current.data+"" );
            current = current.next;
        }
        System.out.println();

    }

    // checking node present in list
    // iterative approach

    public static boolean search(Node head, int x) {
        Node current = head;
        while(current != null) {
            if (current.data == x) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public  static boolean recSearch(Node head, int x){
        if(head==null) return false;
        else if (head.data==x) return true;
        recSearch(head.next,x);
        return false;
    }
    public static void main(String[] args) {
//        LinkedListFindIterative ld = new LinkedListFindIterative();
        // to call this method we have to create that class object first
        /// rememer int a = 5; called int class
        addNode(4);
        addNode(5);
        display();
        boolean data = search(head, 6);
        System.out.println(data);
//         boolean data=recSearch(head, 6);
//        System.out.println(data);

    }
}

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}
