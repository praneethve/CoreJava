package c51;

import java.util.*;
public class QueueExample1 {
	 
   public static void main(String[] args) {
	  
      
      Queue<String> q = new LinkedList<String>();
	    
      
      q.add("Praneeth");
      q.add("Yewanth"); 
      q.add("krishna");
      q.add("maniratham");
      q.add("avinash");
      q.add("kolli");
	    
      System.out.println("Elements in Queue:"+q);

      System.out.println("Removed element: "+q.remove());
	  
      System.out.println("Head: "+q.element());
	    
      
      System.out.println("poll(): "+q.poll());
	    
      
      System.out.println("peek(): "+q.peek());
	    
            System.out.println("Elements in Queue:"+q);
   }
}
