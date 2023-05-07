package JavaCollectionClass;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("MANGO");
        list.add("APPLE");
        list.add("GRAPE");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
