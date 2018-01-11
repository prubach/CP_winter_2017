package pl.waw.sgh.threads;

public class OurThreads {

    private int ourIterator = 0;

    static final int NUM_THREADS = 5;

    //public synchronized void increase(String threadName) {
    public void increase(String threadName) {
        synchronized (this) {
            ourIterator++;
            System.out.println("Thread " + threadName + " our iter: " + ourIterator);
        }
    }


    public static void main(String[] args) {
        OurThreads ourThreads = new OurThreads();

        MyThread[] myThreads = new MyThread[NUM_THREADS];
        for (int i=0;i<NUM_THREADS;i++) {
            myThreads[i] = new MyThread("T_"+i, ourThreads);
        }

        for (int i=0;i<NUM_THREADS;i++) {
            myThreads[i].start();
        }

        /*

        MyThread myThreadA = new MyThread("A");
        MyThread myThreadB = new MyThread("B");
        MyThread myThreadC = new MyThread("C");

        myThreadA.run();
        myThreadB.start();
        myThreadC.start();*/
    }
}
