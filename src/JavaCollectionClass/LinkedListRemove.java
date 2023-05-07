package JavaCollectionClass;

import java.util.LinkedList;

public class LinkedListRemove {

    public static void main(String args[]) {
        LinkedList<String> languages = new LinkedList<>();
        languages.add("Python");
        languages.add("Flutter");
        languages.add("Kotlin");
        languages.add("Java");

        languages.remove(2);
        System.out.println(languages);

//        check if linked list contains the element
        System.out.println(languages.contains("Python"));

        System.out.println(languages.indexOf("Java"));

    }
}
