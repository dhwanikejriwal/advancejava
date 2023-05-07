package JavaCollectionClass;

import java.util.LinkedList;

public class LinkedListAdd {
    public static void main(String args[]){
        LinkedList<String>cars=new LinkedList<String>();
        cars.add("Volvo");
        cars.add("Maruti");
        cars.add("Mahindra");
        cars.add("Tata");

//        use to add the item at the first
        cars.addFirst("BMW");
        System.out.println(cars);
    }

}
