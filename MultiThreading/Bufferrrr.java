package MultiThreading;


import java.util.LinkedList;

class Bufferrr {
    private LinkedList<Integer> queue = new LinkedList<>(); 
    private int size = 5; 

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == size) { // Wait if queue is full
            wait();
        }
        queue.add(value);
        System.out.println("Produced: " + value);
        notify(); // Notify consumer
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) { // Wait if queue is empty
            wait();
        }
        int value = queue.removeFirst();
        System.out.println("Consumed: " + value);
        notify(); // Notify producer
        return value;
    }
}

public class Bufferrrr {
    public static void main(String[] args) {
        Bufferrr buffer = new Bufferrr();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    buffer.produce(i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    buffer.consume();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}

