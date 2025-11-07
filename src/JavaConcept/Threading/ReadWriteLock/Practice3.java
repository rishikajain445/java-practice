package JavaConcept.Threading.ReadWriteLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Practice3 {
    public static void main (String [] args)
    {
        SharedResorce3 s =  new SharedResorce3();
        ReadWriteLock lock = new ReentrantReadWriteLock();
        Thread t1 = new Thread(()->
        {
            s.producer(lock);
        });
        Thread t2 = new Thread(()->
        {
            s.producer(lock);
        });
        Thread t3 = new Thread(()->
        {
            s.consumer(lock);

        });
        t1.start();
        t2.start();
        t3.start();// in this case thread 1 and thread 2 will acquire the lock and release it , then only  thread t3 can acquire write lock after completion of thread 1 and thread2




    }
}
