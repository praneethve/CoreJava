package c70;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Example {
   public static void main(String[] args) {

	List<String> names = Arrays.asList("Praneeth","Avinash","Yeswanth","Krishna","Vishnu");
		
	
	Stream<String> allNames = names.stream();
		
	
	Stream<String> longNames = allNames.filter(str -> str.length() > 6);
		
	
	longNames.forEach(str->System.out.print(str+" "));
  }
}