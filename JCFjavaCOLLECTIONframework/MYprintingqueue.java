package JCFjavaCOLLECTIONframework;

import java.util.PriorityQueue;
import java.util.Queue;

public class MYprintingqueue {
    public static void main ( String args []){
        // create a  priority queue  to store  exam scores 

        Queue<Integer> score = new PriorityQueue<>();
        // adding elements 
        score.offer(85);
        score.offer(33);
        score.offer(88);

        // print the queue 
        System.out.println("score :" + score);
        
        // peek at  the head 
        System.out.println("head of the queen  :" + score.peek());

        // remove & print element in scored order 

        System.out.println(" dequeing elements ");
        while (!score.isEmpty()) {
            System.out.println(score.poll());
        }


    }
}
