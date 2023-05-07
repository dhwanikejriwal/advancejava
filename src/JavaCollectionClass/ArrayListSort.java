package JavaCollectionClass;
import java.util.*;
public class ArrayListSort {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("MANGO");
        list.add("APPLE");
        list.add("GRAPE");
        Collections.sort(list);
        System.out.println(list);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(78);
        list2.add(90);
        list2.add(45);
        Collections.sort(list2);
        System.out.println(list2);

    }
}
