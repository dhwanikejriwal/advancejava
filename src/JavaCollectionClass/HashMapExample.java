package JavaCollectionClass;
import java.util.*;
public class HashMapExample {
    public static void main (String args[]){
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(101,"Dhwani");
        map.put(102,"Deepakshi");
        map.put(103,"Shishant");
        map.put(109,null);

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
