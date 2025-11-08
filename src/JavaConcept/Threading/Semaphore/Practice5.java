package JavaConcept.Threading.Semaphore;

import java.util.concurrent.Semaphore;

public class Practice5 {

    public static void main(String []args) {
        SharedResource5 s = new SharedResource5();
        Semaphore lock = new Semaphore(2);
        Thread t1 = new Thread(() ->
        {
            s.producer(lock);

        });
        Thread t2 = new Thread(() ->
        {
            s.producer(lock);

        });
        Thread t3 = new Thread(() ->
        {
            s.producer(lock);

        });
        t1.start();
        t2.start();
        t3.start();
    }
}
