//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//public class testing2 {
//    public static String str = "";
//    public static void main(String[] args) {
//        Student newStudent = new Student();
//        newStudent.setStr("neeraj singh");
//        System.out.println(newStudent.getStr());
//        Student.setStr("rahul");
//        System.out.println(newStudent.getStr());
//        System.out.println(str.getClass() + str.getClass().getTypeName());
//
//        // intialize arraylist
//        ArrayList<Integer> al = new ArrayList<>();
//        System.out.println("arraylist class"+al.getClass());
//        al.add(321);
//        al.forEach((index) ->{
//            System.out.println("data"+index);
//        });
//        List<String> some = new ArrayList<>(
//                List.of("aome", "some2")
//        );
//    }
//    public static void setStr(String string){
//        str = string;
//    }
//    public static String getStr(){
//        return str;
//    }
//}
//
//class Student {
//    static String name;
//    static int[] array = {1, 2, 4};  // declaring array using array literal
//
//
//    static void setStr (String getname){
//        int[] newArray;
//        newArray = new int[32];
//        name = getname;
//        for (int i = 0; i < 2; i++){
//            array[i] = i;
//        }
//    }
//    String getStr (){
//        return name;
//    }
//    int[] getArray (){
//        return array;
//    }
//}
import java.net.URL;
import java.util.*;

public class testing2 {
    public static void main(String args[])
    {
        String[] newString = new String[]{};
        // create a ArrayList String type
        // and Initialize an ArrayList with List.of()
        List<String> gfg = new ArrayList<>(
//                Arrays.asList("Geeks", "for", "Geeks")
                Arrays.asList(new String[]{"hello"})
        );

        // print ArrayList
        System.out.println("ArrayList : " + gfg);

        testing2 ts  = new testing2();
        System.out.println("ts"+ts);

        // get class loader
        ClassLoader cl = testing2.class.getClassLoader();
         URL str = cl.getResource("wwd");

        System.out.println(str+"dwdw"+ cl+ "cwc"+ cl.getClass());

        // initalozing string array with size
        String[] st = new String[4];

        // list can be initialized as arraylist
        List<String> list = new ArrayList<String>();
        list.getClass();

//        SortedMap sl = new SortedMap();
//       ****** abstract class cannot be instantiated sortedmap and map *******
        TreeMap tm = new TreeMap();

        // testing list of type some class
        SomeInterfacesss datass = null;
        List<SomeInterfacesss> listt = null;
//        SomeInterfacesss somes = new SomeInterfacesss();
//        listt.getMap();
//        List <SomeInterfacesss> ty = listt.get(0).getMap1();
//        System.out.println("dataaaaaaaa"+ty.get(0));
        SomeInterfacesss t1;
        t1 = null;
        listt.add(0, t1);
        listt.get(0).getMap1();
        // type casting
        int d = 3;
        Double f = 4.4;
//        f =  (Double) d;
    }
}

class SomeInterfacesss {
    private int data;
    Map<Currency, Map<String, Integer>> someMap;
    public Map<Currency, Map<String, Integer>> getMap () {
        return someMap;
    }
    public List<SomeInterfacesss> getMap1(){
        List<SomeInterfacesss> test = new ArrayList<SomeInterfacesss>();
        SomeInterfacesss t1=new SomeInterfacesss();
        test.add(0, t1);
        System.out.println("get0"+test.get(0));

        return test;
    }

    public void fillingData() {
        this.data = 5;
    }
}