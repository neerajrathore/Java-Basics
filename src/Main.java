
import java.util.*;
//
//class AnotherMain {
//    public static void main(String[] args) {
//        HashMap<String, Integer> someMap = new HashMap<>();
//        someMap.put("neeraj", 10);
//        someMap.put("rahul", 20);
////        int value  = someMap.get("neeraj");
////        for (Map.Entry<String, Integer>: Map.Entry<String, Integer>){
////
////        }
////        someMap.keySet().forEach(data -> System.out.println(data) );
////        Set entrySet = someMap.entrySet();
////        System.out.println(entrySet);
////        System.out.println(value);
////        By KeySet()
////        for(String key:someMap.keySet()){
////
////        }
////        by Lamda function
//        someMap.forEach((key,value)->{
//            System.out.println(key + value);
//            System.out.println(value);
//        });
////        by entryset
////        for(Map.Entry<String,Integer> entry:someMap.entrySet()){
////            System.out.println(entry.getKey());
////            System.out.println(entry.getValue());
////        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Calendar calender = Calendar.getInstance();
//        calender.setTime(new Date("15-sep-2023"));
//        int value = calender.get(Calendar.DAY_OF_MONTH);
//        if(calender.get(Calendar.MONTH) < 3){
//            calender.set(calender.get(Calendar.YEAR) - 1 , 3, 1);
//        }
//        else{
//            calender.set(calender.get(Calendar.YEAR)  , 3, 1);
//        }
//        System.out.println(calender.getTime());
//    }
//}

class A{
    Main mains;
    A(Main main){
        System.out.println("hello a");
        mains = main;
        System.out.println("mains"+mains);
    }

    void display(){
        System.out.println("didsplay data"+mains.data);
    }
    void m (A obj) {
        System.out.println("method invoked" + obj);
    }
    A(int x){
//        this(); // this can be used to again call constructor
        System.out.println(x);
        // called m with a class
        m(this);

    }
}
class Main{
    int data = 10;
    void thisref(){
        System.out.println("thisrefs"+this);
    }
    Main(){
        A newref = new A(this);
        newref.display();
    }
    public static void main(String args[]){
        A a=new A(10);
        // creating instance of main
        Main ab = new Main();
        System.out.println("ab"+ab);
        ab.thisref();

    }}

