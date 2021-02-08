package c53;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	   public static void main(String[] args) {
			  
	       
	       Deque<String> dq = new ArrayDeque<String>();
		    
	       
		dq.add("Praneeth");
		dq.add("Krishna");
		dq.addLast("Avinash");
		dq.addFirst("Yeswanth");
		dq.add("Manirathnam");
		    
		System.out.println("Elements in Deque:"+dq);

	        		System.out.println("Removed element: "+dq.removeLast());
		    
				 System.out.println("Head: "+dq.element());
		    
		
		System.out.println("poll(): "+dq.pollLast());
		    

		System.out.println("peek(): "+dq.peek());
		    
		System.out.println("Elements in Deque:"+dq);
	   }
	}
