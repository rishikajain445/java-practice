package JavaConcept.Threading.ThreadLocalPractice;

public class practice {
    public static void main(String []args)
    {
        ThreadLocal<String> th = new ThreadLocal<>();
        th.set(Thread.currentThread().getName());
        Thread t1 = new Thread(()->
        {
            try
            {    Thread.sleep(4000);
                th.set(Thread.currentThread().getName());
                System.out.println(th.get());
            }
            catch (Exception e)
            {

            }


        });
        t1.start();


        System.out.println(th.get());
    }
}
