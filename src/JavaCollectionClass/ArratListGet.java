package JavaCollectionClass;
import java.util.*;

public class ArratListGet {
    public static void main (String args[]){
        ArrayList<String>al=new ArrayList<>();
        al.add("Mango");
        al.add("Banana");
        al.add("Orange");
        al.add("Watermelon");

        System.out.println("Returning element:" +al.get(1));
        al.set(1,"Dates");

        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
