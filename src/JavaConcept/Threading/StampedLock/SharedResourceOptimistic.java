package JavaConcept.Threading.StampedLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResourceOptimistic {
    int a = 10;

  public  void producer(StampedLock lock) {

      long stamp =  lock.tryOptimisticRead();
         try
         {
            System.out.println("Acquired optimistic lock");
            a=11;
            Thread.sleep(8000);
            if(lock.validate(stamp))
             {
                  System.out.println("value updated");
             }
            else {
                System.out.println("roolback");
                a = 10;
            }
         }
         catch (Exception e )
         {

         }


    }
    public  void consumer(StampedLock lock) {
      long stamp = lock.writeLock();
        try
        {
           System.out.println("Aquired write lock");
           a=8;
        }
        catch (Exception e )
        {

        }
        finally {
         System.out.println("Releaseing write lock ");
         lock.unlockWrite(stamp);
        }
    }


}
