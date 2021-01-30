package c10;
class Human1
{
	   	   public void walk()
	   {
	       System.out.println("Human walk");
	   }
	}
	class Demo extends Human1
	{
	   	   public void walk(){
	       System.out.println("Boy walking");
	   }
	   public static void main( String args[]) {
	       Human1 obj = new Demo();
	       Human1 obj2 = new Human1();
	       obj.walk();
	       obj2.walk();
	   }
	}
