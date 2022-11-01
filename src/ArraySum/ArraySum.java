package ArraySum;

import java.util.HashMap;

public class ArraySum {
    public static void main(String[] args) {
        int target = 16;
        int[] array = { 2, 9, 11, 14, 15 };

        Object ob = new Object();
        Object ob2 = new Object();

        Some some = new Some();
        Some some2 = new Some();
        System.out.println(ob.hashCode());
        System.out.println(some.hashCode());
        System.out.println(some2.hashCode());
        HashMap<Integer,Integer> differnceMap=new HashMap<>();
//        differnceMap.replace()
        for(int i=0;i<array.length;i++){
            int diff=target-array[i];
            if(differnceMap.containsKey(diff)){
                System.out.println(differnceMap.get(diff));
                System.out.println(i);
            }else{
                differnceMap.put(array[i],i);
            }
        }
    }
}

class Some {
    int data;
    int getdata (){
        return data;
    }

}
