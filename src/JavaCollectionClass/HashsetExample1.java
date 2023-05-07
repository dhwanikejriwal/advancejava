package JavaCollectionClass;
import java.util.*;
public class HashsetExample1 {
    public static void main (String args[]){
        HashSet hs = new HashSet();
        hs.add(1);
        hs.add(2);
        hs.add(null);
        hs.add("Apple");
        hs.add(80);

        System.out.println(hs);

        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains(2));
        System.out.println(hs.remove(80));

        Iterator itr=hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
