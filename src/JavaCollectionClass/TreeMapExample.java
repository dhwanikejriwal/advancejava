package JavaCollectionClass;
import java.util.*;
public class TreeMapExample {
    public static void main (String args[]){
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(1,"happy");
        map.put(4,"Sad");
        map.put(3,"angry");

        System.out.println(map);

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get(100));
        System.out.println(map.size());
        map.remove(3);
        System.out.println(map.replace(4,"Cry"));
        System.out.println(map);

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
