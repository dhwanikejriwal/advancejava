package JavaCollectionClass;
import java.util.*;
public class VectorExample {
    public static void main (String args[]){
        Vector v = new Vector(12, 5);
        v.addElement(1);
        v.addElement(2);
        v.addElement(2);
        v.addElement(null);
        v.addElement(8);
        v.add(12);
        v.add(1,12);

        System.out.println(v);

        v.removeElementAt(1);
        System.out.println(v);

        v.removeElement(12);
        System.out.println(v);

        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.elementAt(3));
        System.out.println(v.get(0));
        System.out.println(v.indexOf(2));
        System.out.println("Initial size: "+v.size());
        System.out.println("Initial capacity "+ v.capacity());

        Enumeration en = v.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }

        Iterator itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
       v.clear();
        System.out.println(v);

    }

}
