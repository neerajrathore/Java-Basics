package LinkedListSearch;

import java.util.*;

public class ArrayGetQ {

    public static int generateNumber(int[] array) {
        int number = 0;
        int counter = 1;
        for(int i = array.length - 1; i >= 0; i--){
            number += counter*array[i];
            counter = counter*10;
        }
        return number;
    }

    public static ArrayList getArray(int number) {
        ArrayList al = new ArrayList<Integer>();
        int a = 5;
        int b= 6;
        int c;
        LinkedList ll = new LinkedList<>();

        ll.addFirst(a);
        ll.addLast(b);
        System.out.println("contains" +ll);
        int digits = 0;
        while(number != 0){
            digits++;
            for(int counters = number; counters>0; counters = counters / 10) {
                counters = counters % 10;
                al.add(counters);
            }
            number = number / 10;
        }
        System.out.println("digits"+digits);
        return al;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.clone();

        // getting new queue and initializing it using LinkedList<>()
        Queue queue = new LinkedList();
//        queue.removeIf();                       // methods will be available of queue and collection

//        int[] arr = new ();

        int a = 6;

        Collection c = new ArrayList();  // collection baap h kisi ko bhi apne andar assign kr skta h

        c.add(a);
        queue.addAll(c);  // this is not addall of linkedlist of collection
        // queue implements collections so addall is there
        System.out.println(queue.addAll(c));

//         Deque deque = new ArrayList<>();
//         List list = new ArrayDeque<>();
//        System.out.println("deque is"+deque);
//         why arraylist cant assign to deque

        // if queue extend or implements something
        // then we will get method of that only like
        // queue extend collection we get method of queue and collections
        // linked list method will not exist in queue



        newObject no = new newObject();
        List l = null;
        Deque d = null;
//        Object o = ll.set(0, no);
        ll.toArray();
//        System.out.println("wcwcw"+o);
        int addedData;
        int[] array = {5, 8, 2};
        System.out.println();
        int[] aaras = {3, 5, 8};
        int aarasdata = 0;
        int arraydata = 0;
        int counter = aaras.length;
        for (int i = 0; i < aaras.length; i++) {
            aarasdata = aarasdata + aaras[i];
        }
        for (int i = 0; i < array.length; i++) {
            arraydata = arraydata + array[i];
        }
        // generate a number of array data

        System.out.println(arraydata +""+ aarasdata);

        addedData = generateNumber(array);
        addedData += generateNumber(aaras);
        System.out.println(addedData);
        ArrayList arrayGot = getArray(941);
        System.out.println(arrayGot);

    }
}

class newObject {
    int data;
    newObject next;
}



