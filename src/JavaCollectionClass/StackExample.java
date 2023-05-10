package JavaCollectionClass;
import java.util.*;
public class StackExample {
    public static void main (String args[]){
        Stack stk=new Stack();
        boolean result= stk.empty();
        System.out.println(result);

        stk.push(null);
        stk.push("ABC");
        stk.push(4);
        stk.push(8);
        stk.push(120);
        stk.push("Happy");

        System.out.println(stk);

        result= stk.empty();
        System.out.println(result);

        stk.pop();
        System.out.println(stk);


        System.out.println(stk.peek());
        System.out.println(stk.search(120));
        System.out.println(stk.size());
        System.out.println(stk.capacity());

    }
}
