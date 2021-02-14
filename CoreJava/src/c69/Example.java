package c69;

import java.util.ArrayList;
import java.util.List;
public class Example{ 
   public static void main(String[] args) {    
	List<String> names = new ArrayList<String>();
	names.add("Praneeth");
	names.add("Krishna");
	names.add("Avinash");
	names.add("Yeswanth");
	names.add("mani");
	int count = 0;
	for (String str : names) {
	   if (str.length() < 6) 
		count++; 
	}
        System.out.println("There are "+count+" strings with length less than 6");
   }  
}
