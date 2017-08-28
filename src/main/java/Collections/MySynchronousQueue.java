package Collections;

import java.util.concurrent.SynchronousQueue;

import static Collections.MySynchronousQueue.CNT;
import static Collections.MySynchronousQueue.random_work_time;
import static Collections.MySynchronousQueue.synchronousQueue;

public class MySynchronousQueue {
    public static final int CNT = 5;
    public static final int random_work_time = 1000;
    public static SynchronousQueue<Integer> synchronousQueue = new SynchronousQueue<>();

    public static void main(String[] args) {
        Thread p = new Thread(new Producer());
        Thread c = new Thread(new Consumer());
        p.start();
        c.start();
    }

}

class Producer implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < CNT; i++) {
            try {
                System.out.println("Producer slip....");
                Thread.sleep(random_work_time);
                System.out.println("Producer wakeup....");
                synchronousQueue.put(i);
                System.out.println("Producer puts into queue....");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < CNT; i++) {
            try {
                System.out.println("Consumer wait queue....");
                int k = synchronousQueue.take();
                System.out.println("Consumer take i from queue....");
                System.out.println("Consumer slip....");
                Thread.sleep(random_work_time);
                System.out.println("Consumer wakeup....");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

