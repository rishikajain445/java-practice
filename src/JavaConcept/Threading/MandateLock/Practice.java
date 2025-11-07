package JavaConcept.Threading.MandateLock;

public class Practice {
    public static void main (String []args) {
        SharedResource sr = new SharedResource();
//        Thread t1 = new Thread(() ->
//        {
//            sr.producer();
//        });
//        Thread t2 = new Thread(()->
//        {
//           sr.producer();
//        });
//        t1.start();     // in this example  we have same shared resorce .. so thread will wait the other one to utilice and release then only it will use
//        t2.start();

        SharedResource sr2 = new SharedResource();
        Thread t3 = new Thread(() ->
        {
            sr.producer();
        });
        Thread t4 = new Thread(()->
        {
            sr2.producer(); // in this exmaple we have 2 shared resource and each thread is calling there respectice as per need no one will wait for other one as mandate lock is based on object instance
        });
        t3.start();
        t4.start();
    }
}
