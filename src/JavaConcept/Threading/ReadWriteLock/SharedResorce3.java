package JavaConcept.Threading.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResorce3 {

     boolean is_available = false;
     public void producer (ReadWriteLock lock)
     {
         try
         {
             lock.readLock().lock();
             System.out.println("Read Lock Acquired" + Thread.currentThread().getName());
             Thread.sleep(4000);
         }
         catch(Exception e)
         {

         }
         finally {
             System.out.println(" Read Lock is released"+Thread.currentThread().getName());
             lock.readLock().unlock();
         }

     }
     public void consumer (ReadWriteLock lock)
     {
         try
         {
             lock.writeLock().lock();
             System.out.println("Write Lock Acquired" + Thread.currentThread().getName());
             is_available = true;
             Thread.sleep(4000);

         } catch (Exception e) {

         }
         finally
         {
             System.out.println(" write Lock is released"+Thread.currentThread().getName());
             lock.writeLock().unlock();
         }

     }
}
