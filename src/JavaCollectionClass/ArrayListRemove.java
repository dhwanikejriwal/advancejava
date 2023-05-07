package JavaCollectionClass;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRemove {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("MANGO");
        list.add("APPLE");
        list.add("GRAPE");
//        list.remove(1);
        list.clear();
        Iterator itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
