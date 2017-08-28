package Collections.CopyOnWrite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
            copyOnWriteArrayList.add(i);
        }

        List<Integer> synchronizedList = Collections.synchronizedList(arrayList);
        System.out.println("synchronizedList");
        checklist(synchronizedList);
        System.out.println("copyOnWriteArrayList");
        checklist(copyOnWriteArrayList);

    }

    static void checklist(List<Integer> list) throws ExecutionException, InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Long> future = executorService.submit(new ListRunner(0, 499, list, latch));
        Future<Long> future2 = executorService.submit(new ListRunner(500, 999, list, latch));
        latch.countDown();
        System.out.println("Thread 1 " + future.get()/1000);
        System.out.println("Thread 2 " + future2.get()/1000);
    }

    static class ListRunner implements Callable<Long> {
        List<Integer> list;
        CountDownLatch latch;
        int begin, end;

        public ListRunner(int begin, int end, List<Integer> list, CountDownLatch latch) {
            this.list = list;
            this.latch = latch;
            this.begin = begin;
            this.end = end;
        }

        @Override
        public Long call() throws Exception {
            latch.await();
            long startTime = System.nanoTime();
            for (int i = begin; i < end; i++) {
                list.set(i, i+1);
            }
            return System.nanoTime() - startTime;
        }
    }


}