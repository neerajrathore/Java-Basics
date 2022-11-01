package BubbleSort;

import java.util.ArrayList;

public class SortData {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0, 3);
        al.add(1, 5);
        System.out.println(al.get(0));
        int firstData = al.get(0);
        int secondData = al.get(1);
        al.forEach((n)->{
            System.out.println(n);

        });
        for (int i = 0; i< 2; i++){
            if(al.get(i) < al.get(i+1)) {
                al.set(0, al.get(i+1));
                al.set(1, al.get(i));
            }
            al.get(i);
        }

        for (Integer data: al){
            System.out.println(data.intValue());
        }
    }
}


