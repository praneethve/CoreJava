package c69;

import java.util.ArrayList;
import java.util.List;
public class Example1{ 
   public static void main(String[] args) {    
	List<String> names = new ArrayList<String>();
	names.add("Praneeth");
	names.add("Krishna");
	names.add("Yeswanth");
	names.add("Avinash");
	names.add("mani");
	long count = names.stream().filter(str->str.length()<6).count();
	System.out.println("There are "+count+" strings with length less than 6");

   }  
}
