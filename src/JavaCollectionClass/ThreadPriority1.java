package JavaCollectionClass;
import java.lang.*;
public class ThreadPriority1 extends Thread{
    public void run(){
        System.out.println("Inside the run() method");

    }
    public static void main (String args[]){
        ThreadPriority1 th1=new ThreadPriority1();
        ThreadPriority1 th2=new ThreadPriority1();
        ThreadPriority1 th3=new ThreadPriority1();

        System.out.println("Priority of th1: " + th1.getPriority());
        System.out.println("Priority of th2: " + th2.getPriority());
        System.out.println("Priority of th3: " + th3.getPriority());

        th1.setPriority(5);
        th2.setPriority(3);
        th3.setPriority(9);

        System.out.println("Priority of th1: " + th1.getPriority());
        System.out.println("Priority of th2: " + th2.getPriority());
        System.out.println("Priority of th3: " + th3.getPriority());

        System.out.println("Currently executing thread: "+ Thread.currentThread().getName());
        System.out.println("Priority of current thread: " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Priority of current thread: " + Thread.currentThread().getPriority());
    }
}
