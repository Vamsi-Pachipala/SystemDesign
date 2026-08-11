package DesignProblems.ProducerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

    private static final int CAPACITY = 10;
    private static final BlockingQueue<Integer> queue =
            new ArrayBlockingQueue<>(CAPACITY);

    public static void main(String[] args) {

        Thread producer = new Thread(() -> produce(), "Producer");
        Thread consumer = new Thread(() -> consume(), "Consumer");

        producer.start();
        consumer.start();
    }

    private static void produce() {

        int value = 1;

        while (true) {
            try {

                queue.put(value);

                System.out.println(
                        Thread.currentThread().getName()
                                + " Produced : " + value
                                + " | Queue Size : " + queue.size());

                value++;

                Thread.sleep(500);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    private static void consume() {

        while (true) {
            try {

                int value = queue.take();

                System.out.println(
                        Thread.currentThread().getName()
                                + " Consumed : " + value
                                + " | Queue Size : " + queue.size());

                Thread.sleep(1000);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}