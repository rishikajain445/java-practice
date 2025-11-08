package JavaConcept.Threading.CompletableFuture;

import java.util.concurrent.*;

public class practice {
    public static  void main (String [] args) throws ExecutionException, InterruptedException {

        ThreadPoolExecutor th = new ThreadPoolExecutor(2, 3, 300000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory()
                , new ThreadPoolExecutor.DiscardPolicy());

        try {

            CompletableFuture<String> asyncObj = CompletableFuture.supplyAsync(() -> // alternatie of executor sumit when we want more controll
            {
                return "result";
            }, th);

            System.out.println(asyncObj.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        CompletableFuture<String> asyncObj2 = CompletableFuture.supplyAsync(() ->
        {
            return "result"; //Task that needs to execute
        }, th).thenApply((String val )->{
            return val+" apply"; // functionality which can work  on the result  of previous async task
        });
        try
        {
            System.out.println(asyncObj2.get());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // thenApply thenApplyAsync Practice

        CompletableFuture<String> asyncObj3 = CompletableFuture.supplyAsync(() ->
        {
            System.out.println("asyn " + Thread.currentThread().getName());
            return "coding";
        },th).thenApplyAsync((String val)->
        {
            System.out.println("then apply asyn " + Thread.currentThread().getName());
           return val+ "concept";
        },th);

        try
        {
            System.out.println(asyncObj3.get());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //thenCompose thenComposeAsync

        CompletableFuture<String> asyncObj4 = CompletableFuture.supplyAsync(() ->
        {
            System.out.println("asyn " + Thread.currentThread().getName());
            return "coding";
        },th);
        CompletableFuture<String> asyncObj5 = asyncObj4.thenCompose((String val) ->
        {
            return  CompletableFuture.supplyAsync(()-> val + "Async");
        });

        System.out.println(asyncObj5.get());

        //thenCombine thenCombineAsync
        CompletableFuture<String> asyncObj6 = CompletableFuture.supplyAsync(() ->
        {
            System.out.println("asyn " + Thread.currentThread().getName());
            return "coding";
        },th);
        CompletableFuture<String> asyncObj7 = CompletableFuture.supplyAsync(() ->
        {
            System.out.println("asyn " + Thread.currentThread().getName());
            return "coding";
        },th);

        CompletableFuture<String> result = asyncObj6.thenCombine(asyncObj7,(a,b)->a+b);

        System.out.println(result.get());








    }
}
