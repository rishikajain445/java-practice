package JavaConcept.Threading.Semaphore;

import java.util.concurrent.Semaphore;

public class SharedResource5 {
    boolean isAvailable = false;
   public void producer(Semaphore lock) {
       try {

           lock.acquire();
           System.out.println("Aquired lock");
           isAvailable = true;
           Thread.sleep(4000);

       }
       catch (Exception e) {

       }
       finally {
           System.out.println("Released lock");
           lock.release();
       }
   }
}
