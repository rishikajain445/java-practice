package JavaConcept.Threading.CallablePractice;

import java.util.concurrent.*;

public class Practice {

    public static  void main (String [] args)
    {

        ThreadPoolExecutor th = new ThreadPoolExecutor(2, 3, 300000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory()
                , new ThreadPoolExecutor.DiscardPolicy());

        Future<?> futureObject = th.submit(()->
        {
            System.out.println("Runnable called "); // since void runnable flavour of submit will be called
        });

        Future<?> futureObject2 = th.submit(()->
        {
            System.out.println("Runnable called ");
            return 45;  // since there is a return statemnet submit will callable will be called
        });


    }
}
