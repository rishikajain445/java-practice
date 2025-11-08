package JavaConcept.Threading.ThreadPoolPractice;

import java.util.concurrent.*;

public class Practice {

    public  static  void main (String [] args) {
        ThreadPoolExecutor th = new ThreadPoolExecutor(2, 3, 300000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory()
                , new ThreadPoolExecutor.DiscardPolicy());

        for (int i = 0; i < 5; i++) {
            th.submit(() ->
            {
                System.out.println("Thread is started with name " + Thread.currentThread().getName());
            });
        }





    }


}
