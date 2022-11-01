package ArrayClass;

public class ArrayTest {
    public static void main(String[] args) {
        Array a1 = new Array(3);
//        Array data = a1.toString();
        a1.insert(1);
        a1.insert(2);
        a1.insert(3);
        a1.insert(4);
        a1.insert(5);
        a1.delete(2);
        a1.print();
    }
}

class Array {
    int[] items;
    int count;
    public Array(int a) {
        items = new int[a];
    }
    public void insert (int data) {
        if(count== items.length){
            int[] newww = new int[count*2];
            for (int i = 0; i< items.length; i++){
                newww[i]= items[i];
            }
            items = newww;
            items[count++] = data;
        }
        else {
            items[count++] = data;
        }
    }
    public void print () {
        for(int i =0; i< count; i++){
            System.out.println(items[i]);
        }
    }
    public int[] delete (int index) {
        // pushes data to previous indexex
        for (int i = index; i < count ; i++){
            items[i] = items[i+1];
        }
        count--;
        return items;
    }

}
