package c7;


	class B1 extends A1
	{
	   public void methodB()
	   {
	     System.out.println("Child class method");
	   }
	   public static void main(String args[])
	   {
	     B1 obj = new B1();
	     obj.methodA();
	     obj.methodB(); 
	  }
	}
