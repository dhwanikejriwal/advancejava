package JavaCollectionClass;

import java.util.LinkedList;

public class LinkedListAccess {
    public static void main(String args[]){
        LinkedList<String>languages=new LinkedList<>();
        languages.add("Python");
        languages.add("Flutter");
        languages.add("Kotlin");
        languages.add("Java");

        System.out.println(languages.get(3));

    }
}
