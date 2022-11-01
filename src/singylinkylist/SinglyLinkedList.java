package singylinkylist;

public class SinglyLinkedList {

    // represent singlelinked list
    public Node head = null;
    public Node tail = null;

    void addNode (int data) {
        // create a new node
        Node newNode = new Node(data);

        // cheking if list is empty
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void display (){
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

    public static void main(String[] args) {
        SinglyLinkedList slist = new SinglyLinkedList();
        slist.addNode(1);
        slist.addNode(2);
        slist.display();
    }
}

  class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
