package JavaCollectionClass;
import java.lang.Thread;
public class ThreadExample extends Thread{
    public void run()
    {
        System.out.println("Thread is running");
    }
    public static void main(String args[]){
        ThreadExample obj = new ThreadExample();
        obj.start();
    }

}
