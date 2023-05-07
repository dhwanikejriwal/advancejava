package JavaCollectionClass;

import java.util.LinkedList;

public class LinkedListElementChange {
    public static void main(String args[]) {
        LinkedList<String> languages = new LinkedList<>();
        languages.add("Python");
        languages.add("Flutter");
        languages.add("Kotlin");
        languages.add("Java");

        languages.set(2,"Javascript");

        System.out.println(languages);

    }
}
