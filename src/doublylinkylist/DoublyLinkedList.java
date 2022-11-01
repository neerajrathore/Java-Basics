package doublylinkylist;

public class DoublyLinkedList {

    // represent head and tail
    Node head, tail = null;

    void addNode (int data) {
        // first check if prev node exists
        System.out.println("addnode data"+data);
        System.out.println(head +"dataaaaaaaaaa"+ tail);
        Node newNode = new Node(data);
        System.out.println("newNode-->"+newNode+"node prev--->"+newNode.prev+"node next--->"+newNode.next+"--->node data"+newNode.data);
            if(head == null) {
                // filling head and tail both as newNode
                System.out.println("in addnode head null");
                head = tail = newNode;
                head.prev = newNode;
                tail.next = newNode;
            }
            else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
                tail.next = null;
            }
    }

    void display () {
//        creating Node variable
        Node current = head;
        if(head == null){
            System.out.println("list is empty");
        }
        System.out.println("current null" + current+"current prev-->"+current.prev+"current next-->"+current.next+"current data -->"+current.data);
        while (current != null) {
            System.out.println(current.prev+"  "+current.data +"  " +current.next);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dlist = new DoublyLinkedList();
        dlist.addNode(1);
        dlist.addNode(2);
        dlist.addNode(3);
        dlist.addNode(4);
        dlist.display();
    }

}

class Node {
    int data;
    Node prev;
    Node next;
    public Node (int data){
        this.data = data;
    }

}
