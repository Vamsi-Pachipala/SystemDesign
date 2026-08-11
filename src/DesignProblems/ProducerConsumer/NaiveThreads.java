package DesignProblems.ProducerConsumer;

import java.util.LinkedList;

public class NaiveThreads {

    private static final int CAPACITY = 10;

    private final LinkedList<Integer> buffer = new LinkedList<>();

    public static void main(String[] args) {

        NaiveThreads main = new NaiveThreads();

        Thread producerThread = new Thread(() -> {
            try {
                main.produce();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                main.consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
    public synchronized void produce() throws InterruptedException {

        while (true) {

            while (buffer.size() == CAPACITY) {
                wait();
            }

            buffer.add(buffer.size());

            System.out.println("Produced : " + buffer.size());

            notifyAll();
        }
    }

    public synchronized void consume() throws InterruptedException {

        while (true) {

            while (buffer.isEmpty()) {
                wait();
            }

            buffer.removeFirst();

            System.out.println("Consumed : " + buffer.size());

            notifyAll();
        }
    }
}