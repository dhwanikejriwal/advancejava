package JavaCollectionClass;
class Table {
    synchronized void print(int n) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i * n);
            try{
                Thread.sleep(400);
            }
            catch(Exception e){}

        }
    }
}

class Thread1 extends Thread{
    Table t;
    Thread1 (Table t){
        this.t=t;
    }
    public void run(){
        t.print(5);
    }
}

class Thread2 extends Thread{
    Table t;
    Thread2(Table t){
        this.t=t;
    }
    public void run (){
        t.print(200);
    }
}

public class ThreadSyncMethod {
    public static void main (String args[]){
        Table obj=new Table();
        Thread1 t1=new Thread1(obj);
        Thread2 t2=new Thread2(obj);
        t1.start();
        t2.start();
    }
}
