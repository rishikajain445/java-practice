package JavaConcept.Threading.FuturePractice;

import java.util.concurrent.*;

public class Practice {

    public static  void main (String [] args)
    {

        ThreadPoolExecutor th = new ThreadPoolExecutor(2, 3, 300000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory()
                , new ThreadPoolExecutor.DiscardPolicy());

        Future<?> futureObject = th.submit(()->
        {
            try
            {
                Thread.sleep(4000);
                System.out.println("Future thead runniung");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        });
        try {
            System.out.println(futureObject.isDone()) ;

        }catch (Exception e)
        {

        }
        try {
            futureObject.get(200, TimeUnit.MILLISECONDS);

        }catch (Exception e)
        {

        }
        try {
            futureObject.get();

        }catch (Exception e)
        {

        }



    }
}
