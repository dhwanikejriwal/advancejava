package JavaCollectionClass;
import java.util.*;
public class TreeSetExample {
    public static void main (String args[]){
        TreeSet ts=new TreeSet();
        ts.add(11);
        ts.add(12);
        ts.add(8);

        System.out.println(ts);

        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.remove(12));
        System.out.println(ts);
        System.out.println(ts.isEmpty());
        System.out.println(ts.contains(4));
        Iterator itr= ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
