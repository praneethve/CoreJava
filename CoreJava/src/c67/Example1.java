package c67;

import java.util.function.BiFunction;  
class Multiplication{  
   public static int multiply(int a, int b){  
	return a*b;  
   }  
}  
public class Example1 {  
   public static void main(String[] args) {  
	BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;  
	int pr = product.apply(99, 5);  
	System.out.println("Product of given number is: "+pr);  
   }  
}
