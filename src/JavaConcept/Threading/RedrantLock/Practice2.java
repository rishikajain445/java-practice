package JavaConcept.Threading.RedrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Practice2 {
    public static  void main (String []args)
    {
        ReentrantLock lock = new ReentrantLock();
        SharedResouce2 sr = new SharedResouce2();
        SharedResouce2 sr2 = new SharedResouce2();
        Thread t1 = new Thread(()->
        {
            sr.producer(lock);

        });
        Thread t2 = new Thread(()->
        {
            sr2.producer(lock);

        });
        t1.start();
        t2.start(); // even though there might be 2 diff separate shared resource since lock is one only .. thread will wait for other thread to cimplete first and release the log

    }
}
