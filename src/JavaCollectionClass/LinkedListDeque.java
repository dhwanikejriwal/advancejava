package JavaCollectionClass;

import java.util.LinkedList;
import java.util.Deque;

public class LinkedListDeque {
    public static void main(String args[]) {
        Deque<String> animals = new LinkedList<>();
        animals.add("Cow");
        System.out.println("Linked List: "+animals);

        animals.addFirst("elephant");
        System.out.println("Linked List after addFirst(): "+animals);

        animals.addLast("Dog");
        System.out.println("Linked List after addLast(): "+animals);

        animals.removeFirst();
        System.out.println("Linked List after removeFirst(): "+animals);

        animals.removeLast();
        System.out.println("Linked List after removeLast(): "+animals);

    }
}
