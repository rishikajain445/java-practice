package JavaConcept.Threading.MandateLock;

public class SharedResource
{
    boolean isAvailable = false;
    public synchronized void producer()

    {
        try {
            System.out.println("Lock Acquired by " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);

        } catch (Exception e) {

        }
        System.out.println("Lock released by " + Thread.currentThread().getName());
    }
}
