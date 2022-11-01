package Queue;

import java.util.*;

public class Dequeues {


    public static void main(String[] args) {
        int a = 5;

        String ab = "cw";
        // deck both as a que and stack
        // take array/dequeue of size n dequeue is somewhat array

        // since deck is a interfdce we cant create instance of it
        // instead create a intance of a class that implements deck
        // arraydeck keeps the deck in an array
        // where in linked list keeps elemets in traditional linked list with nodes
        // list pointing to next node

        Queue<String> queue = new LinkedList();
        // <> type specifying is a good practice as it will suggest what type value it can hold
        int front = -1;
        int rear = 0;
        queue.add(ab);

        List l = new ArrayList(); // created a new collectoion object
        // lits object that point to collection

        Deque<Integer> deque = new ArrayDeque();
//        deque.offer("a");
        deque.offer(Integer.valueOf(4));
        deque.addFirst(34);
        Integer data = deque.poll();
        System.out.println(deque);

        List lsit = new ArrayList();
        // highlited black are current class methods and other non highlighted are inherited classes methods
        System.out.println(queue+"dwwd"+lsit);
    }
}

