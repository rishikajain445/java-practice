package JavaConcept.Threading.ScheduledPool;

import java.util.concurrent.*;

public class Practice {

    public static void main (String [] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);
        Future<?> futureObj = pool.schedule(()-> System.out.println("Hello"),5, TimeUnit.MILLISECONDS);
        System.out.println(futureObj);
      Future<Integer> futureObj1 =  pool.schedule(()->
        {
            return 5;
        },2,TimeUnit.MILLISECONDS);
      System.out.println(futureObj1.get());
      //------------------------

        Future<?> futureObj3 = pool.scheduleAtFixedRate(()-> System.out.println("Hello"),3,5, TimeUnit.MILLISECONDS);//initial will print after 3 sec then after 5 sec in order to stop need to put condition otherwise will keep on runinng foever
        try
        {
            Thread.sleep(1000);
            futureObj3.cancel(true);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //-------------------------- scenerio

        Future<?> futureObj4 = pool.scheduleAtFixedRate(()->
        {
            System.out.println("Task is picked");
            try
            {
                Thread.sleep(6000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("Tsk is finished");
        },3,5, TimeUnit.MILLISECONDS);//initial will print after 3 sec then after 5 sec in order to stop need to put condition otherwise will keep on runinng foever
        // in this 1 therad is picked it works but get to sleep other thread waits for completion hence just after it is finished thread to executes without any delay

          //-----------------------
        Future<?> futureObj5= pool.scheduleWithFixedDelay(()->
        {
            System.out.println("Task is picked");
            try
            {
                Thread.sleep(6000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("Tsk is finished");
        },3,5, TimeUnit.MILLISECONDS);
        //in this the second thread will only start after the completion of first and delay mentioned in the config
    }
}
