package c16;
	import java.util.ArrayList;
	import java.util.Collections;
	public class example4
	 {
	   public static void main(String[] args) {
	      ArrayList<String> fruits = new ArrayList<String>();
	      fruits.add("Orange");
	      fruits.add("Apple");
	      fruits.add("Banana");
	      fruits.add("Pineapple");
	      Collections.sort(fruits);

	      for (String str : fruits) {
	         System.out.println(str);
	      }
	   }
	}
