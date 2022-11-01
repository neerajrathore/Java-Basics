package linkedList;

public class LinkedList {
    private Node head=null;
    private Node tail=null;
    public void addAtLast(int item){
        Node newNode=new Node(item); //newNode vaue=item next=null
        if(head==null){
          head=tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void addAtFirst(int item) {
        Node newNode = new Node(item);
        if(head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
//            head.next = newNode;
            head = newNode;
        }
    }

    public void addAtIndex(int index, int data) {
        Node newNode = new Node(data);
        // calculating length of linked list
        Node ptr;
        ptr = head;
        int length = 0;
        while (ptr.next != null) {
            length++;
            ptr = ptr.next;
        }
        System.out.println(length);
        int count = ((length%2) == 0)? (length/2): ((length +1)/2);
        while(count-->1){
            ptr = ptr.next;
        }
        newNode.next = ptr;
        ptr.next = newNode;

    }
    private class Node{
        private int value;
        private Node next;

        public Node(int item) {
            this.value=item;
            this.next=null;
        }
    }
}

