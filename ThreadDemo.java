// Practice program: simple Thread and Runnable examples

public class ThreadDemo
{
    static class Worker extends Thread
    {
        public void run()
        {
            System.out.println("Worker thread running: " + Thread.currentThread().getName());
        }
    }

    static class Task implements Runnable
    {
        public void run()
        {
            System.out.println("Runnable task executed: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        Worker w = new Worker();
        Thread t = new Thread(new Task());
        w.start();
        t.start();
        w.join();
        t.join();
        System.out.println("Main finished");
    }
}
