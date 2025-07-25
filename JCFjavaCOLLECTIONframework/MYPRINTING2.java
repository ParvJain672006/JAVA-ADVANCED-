package JCFjavaCOLLECTIONframework;

import java.util.PriorityQueue;
import java.util.Queue;

public class MYPRINTING2 {
    public static void main ( String args []){
        Queue<Integer>h = new PriorityQueue<>();

         h.offer(11);
         h.offer(12);
         h.offer(13);
         h.offer(14);
         h.offer(15);
         h.offer(16);
         h.offer(17);
         h.offer(18);
         h.offer(19);
         h.offer(120);
         

         System.out.println( " printing all queue " + h);

         System.out.println();

         // Remove specific elements from the queue
         h.remove(11); 
         h.remove(14);
         h.remove(12);
         h.remove(13);

         System.out.println();

         while(!h.isEmpty()){

         System.out.println(" displaying remaining " + h.poll());

         }


        
    }
    
}
