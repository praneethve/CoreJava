package c12;

class Example3{
	  public static void main(String args[]){
	    try{
	       System.out.println("First statement of try block");
	       int num=15/3;
	       System.out.println(num);
	    }
	    catch(ArrayIndexOutOfBoundsException e){
	       System.out.println("ArrayIndexOutOfBoundsException");
	    }
	    finally{
	       System.out.println("finally block");
	    }
	    System.out.println("Out of try-catch-finally block");
	  }
	}
