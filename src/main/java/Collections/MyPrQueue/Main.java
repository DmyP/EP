package Collections.MyPrQueue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new PriorityQueue<>();
        Queue<Integer> queue3 = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                boolean is_o1_even = o1 % 2 == 0;
                boolean is_o2_even = o2 % 2 == 0;

                if (is_o1_even & !is_o2_even) {
                    return -1;
                }
                if (!is_o1_even & is_o2_even) {
                    return 1;
                }
                return 0;
            }
        });

            queue1.offer(5);
            queue1.offer(2);
            queue1.offer(1);
            queue1.offer(4);
            queue2.offer(5);
            queue2.offer(2);
            queue2.offer(1);
            queue2.offer(4);
            queue3.offer(5);
            queue3.offer(2);
            queue3.offer(1);
            queue3.offer(4);

        System.out.println("LinkedList");
        while (!queue1.isEmpty()) {
            System.out.print(queue1.poll() + ",");
        }

        System.out.println("\nPriorityQueue");
        while (!queue2.isEmpty()) {
            System.out.print(queue2.poll() + ",");

        }

        System.out.println("\nMyPriorityQueue - odd first");
        while (!queue3.isEmpty()) {
            System.out.print(queue3.poll() + ",");

        }

    }
}
