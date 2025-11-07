package JavaConcept.Threading.RedrantLock;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResouce2 {
    boolean is_Availble =  false;
    public void producer (ReentrantLock lock)
    {
        try
        {
            lock.lock();
            System.out.println("Lock is Acquired"+Thread.currentThread().getName());
            is_Availble = true;
            Thread.sleep(4000);

        }
        catch (Exception e)
        {

        }
        finally {
            System.out.println("Lock is released"+Thread.currentThread().getName());
            lock.unlock();


        }

    }
}
