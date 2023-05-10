package JavaCollectionClass;
import java.lang.*;
public class ThradExample2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread created");
    }
    public static void main (String args[]){
        Thread t = new Thread(new ThradExample2());
        t.start();
    }
}
