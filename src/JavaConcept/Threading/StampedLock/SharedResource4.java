package JavaConcept.Threading.StampedLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource4 {

    boolean isAvailable = false;

    public void producer (StampedLock lock)
    {
        long stamp = lock.readLock();
        try
        {
         System.out.println("Acquiring stamped  Read lock " + Thread.currentThread().getName());
         Thread.sleep(4000);
        }
        catch (Exception e)
        {

        }
        finally
        {
            System.out.println("Releasing  stamped  Read lock " + Thread.currentThread().getName());
             lock.unlockRead(stamp);
        }
    }

    public  void consumer(StampedLock lock)
    {
        long stamp =  lock.writeLock();
        try
        {
            System.out.println("Acquiring stamped Write  lock " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally
        {
            System.out.println("Releasing  stamped  Write lock " + Thread.currentThread().getName());
            lock.unlockWrite(stamp);
        }
    }
}
