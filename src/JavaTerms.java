import java.util.*;

public class JavaTerms {

    // abstract class cannot be instantiate
//    Abstract ab = new Abstracto();

    public static void main(String[] args) {
//        JavaTerms jt = (JavaTerms) new Abstracto();
        // abstract example
//            TestAbtraction tb = new TestAbtraction();
//            Abstracto ab = new TestAbtraction();
//            ab.someMethod();

        someInterface si = new Abc();
        si.method1(5);

        // default hash map
        DefaultHashMap dh = new DefaultHashMap(32);
        dh.put("key1", 12);
        dh.get("key1");
        Map<String, Integer> map = new HashMap();
        map.put("qwerty", 23);
        map.put("qwerty2", 233);
        // its good to iterate over an array in sequential manner without knowing the index
        // set is curly braces data {}
//        for(String entry: map.keySet()){
        for(Map.Entry some: map.entrySet()){
                System.out.println("entry"+some);
            }
        }
//        Iterator it = map.entrySet().iterator();

//        dh.putAll(map);
//        map.

        // don't same js objects with it the map contains data in an array

//        System.out.println(dh.get("key1") +""+ map);
    }


// abstract example
//abstract class Abstracto {
//    void someMethod() {
//        System.out.println("some methid callews");
//    }
//}
//
//class TestAbtraction extends Abstracto {
//}

// interface example
interface someInterface {
    void method1(int a);

}

class Abc implements someInterface {
    @Override
    public void method1(int b) {
        System.out.println("method 1 called");
    }
}

class Bike {
    final void run () {
        System.out.println("running");
    }
}

class SomeBike extends Bike {
    // parent is Bike
    // run method cannot be overwritten because its final
    // and also we are overriding method run here from parent in child
//    void run () {
//    super();  only this can call parent run method
//        System.out.println("some");
//    }
    public static void main(String[] args) {
        new SomeBike().run();
        Bike b = new Bike(); //We are calling the run method by the reference variable of Parent class
        b.run();
    }
}

// polymorphism example
// Like a man at the same time is a father, a husband and an employee
//Any Java object that can pass more than one IS-A test is considered to be polymorphic
// all Java objects are polymorphic since any object will pass the IS-A test for their own type and for the class Object.


// static example
class student{
    String name;
    int age;
    static String schoolName;

    static
    void getName() {
        System.out.println("getname called");
    }
}

class teststudent{
    public static void main(String[] args) {
        student rahul = new student();
        student.schoolName = "abc";

//        rahul.schoolName = "ABC";
        rahul.name = "rahul";
        rahul.age = 28;

        student neeru = new student();
//        neeru.schoolName = "ABC";
        neeru.name = "neru";
        neeru.age = 22;

        System.out.println();

        student.getName();
    }
}

interface Vegetarian {}
class Animal{}
//class Deer  extends Animal implements Vegetarian  {
////    Animal a = d;
////    Vegetarian v = (Vegetarian) a;
////    Object o = d;
//    public static void main(String[] args) {
//
//
//    }
//}

class DefaultHashMap extends LinkedHashMap<String, Integer> {
       protected int defaultValue;
       public DefaultHashMap(int defaultValue) {
            this.defaultValue = defaultValue;
       }

    public int getDefaultValue() {
        return defaultValue;
    }

}

