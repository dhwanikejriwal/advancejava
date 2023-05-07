package JavaCollectionClass;

import java.lang.reflect.AccessibleObject;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String args[]){
        Queue<String> languages=new LinkedList<>();
        languages.add("Python");
        languages.add("Flutter");
        languages.add("Kotlin");
        languages.add("Java");

        System.out.println("LinkedLIst:" + languages);

//        returns the first element
        String str1=languages.peek();
        System.out.println("Accessed Element:"+str1);

//       returns amd remove the first element
        String str2=languages.poll();
        System.out.println("Removed Element"+str2);
        System.out.println("Linked List after poll"+languages);

//        add element at the last
        languages.offer("HTML");
        System.out.println("Linked List after offer : "+ languages);


    }

}
