package c10;

class Human{
	   public static void walk()
	   {
	       System.out.println("Human walk");
	   }
	}
	class Boy extends Human{
	   public static void walk(){
	       System.out.println("walking");
	   }
	   public static void main( String args[]) {       
	       Human obj = new Boy();
	       Human obj2 = new Human();
	       obj.walk();
	       obj2.walk();
	   }
	}