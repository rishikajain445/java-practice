package JavaConcept.Threading.StampedLock;

import java.util.concurrent.locks.StampedLock;

public class Practive4 {
    public static void main (String[] args)
    {
        StampedLock lock = new StampedLock();
        SharedResource4 s1 = new SharedResource4();
        Thread t1 = new Thread(()->
        {
            s1.producer(lock);
        });
        Thread t2 = new Thread(()->
        {
            s1.producer(lock);
        });
        t1.start();
         t2.start();


        //optimistic practice
        StampedLock lock2 = new StampedLock();
        SharedResourceOptimistic s2 = new SharedResourceOptimistic();
        Thread t3 = new Thread(()->
        {
            s2.producer(lock2);
        });
        Thread t4 = new Thread(()->
        {
            s2.consumer(lock2);
        });

        t3.start();
        t4.start();


    }
}
