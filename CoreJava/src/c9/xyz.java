package c9;

class ABC{
	   public void myMethod(){
		System.out.println("Overridden Method");
	   }
	}
	public class xyz extends ABC{

	   public void myMethod(){
		System.out.println("Overriding Method");
	   }
	   public static void main(String args[]){
		ABC obj = new xyz();
		obj.myMethod();
	   }
	}
