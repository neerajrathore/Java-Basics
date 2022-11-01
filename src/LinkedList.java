import irtd.Order;

public class LinkedList {
    static int a;

    //addNode() will add a new node to the list


    public static void main(String[] args) {
        Node head;
        JavaTerms jt = new JavaTerms();
        Order or = new Order();

        LinkedList ll = new LinkedList();
        System.out.println(ll.hashCode());
//        Student s1 = new Student("wdwd");
////        s1.clgName = "hjjg";
//        Student.setClgName("XYZ");
//        Student.main();

    }
}

 class Student {
    String name;
    int rollNo;
    static String clgName;
     Student(String name) {
        System.out.println(name);
    }
    static void setClgName (String name) { clgName = name; }
    void setName (String studentName) { name = studentName; }
    void setRollNo (int rollNoo) { rollNo = rollNoo; }

    // main method
    public static void main() {
         setClgName("dwdw");

        System.out.println("main called "+clgName);
    }

}
