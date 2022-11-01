package otherType;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SomeInterface {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // creating list of type otherInterface
        List<otherInterface> list = new ArrayList<>();

        // how these are different
//        List<String> newList = new ArrayList();
        otherInterface oI = new otherInterface();
        // list.set(0, oI).setData(3); set return previous data which is null setdata wont work
//        oI.setData(3);
        list.add(oI);
//        int data =  list.get(0).getData();
        System.out.println(list.get(0).getData());

//        otherInterface oI = new otherInterface();
//        oI.setData(5);
//        list.add(0,oI);
//        System.out.println(list.get(0).getData());
//        for(otherInterface x:list){
//            System.out.println(x.getData());
//        }

        List<String> liis = new ArrayList<>();
//        liis.set(0 , "ewd");
//        for(String st : liis){
//            st.equals("fef");
//        }

        // some other example trying out
        someOtherInterface soi = someOtherInterface.class.getConstructor(String.class).newInstance();
        System.out.println("soi"+soi);


    }
}

class otherInterface {
    private String data;
    public void setData (String data) {
        this.data = data;
    }
    public String getData () {
        return data;
    }
}

class someOtherInterface {
    public String st;
    List <otherInterface> osd = null;
    public otherInterface passString() {
        // will have to return otherInterface type data
        return osd.get(0);
    }

}