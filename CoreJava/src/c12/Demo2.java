package c12;
class Example1{
	   public void display1(){
	      System.out.println("display1 method");
	   }
	}
	abstract class Example2{
	   public void display2(){
	      System.out.println("display2 method");
	   }
	}
	abstract class Example3 extends Example1{
	   abstract void display3();
	}
	class Demo1 extends Example3{
	   public void display3(){
	      System.out.println("display3 method");
	   }
	}
	class Demo2{
	   public static void main(String args[]){
	       Demo1 obj=new Demo1();
	       obj.display3();
	   }
	}
