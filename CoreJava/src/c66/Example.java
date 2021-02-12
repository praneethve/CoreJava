package c66;

interface MyFunctionalInterface {

	
    public String sayHello();
}
public class Example {

   public static void main(String args[]) {
    	MyFunctionalInterface msg = () -> {
    		return "Hello";
    	};
        System.out.println(msg.sayHello());
    }
}