package c69;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Example3 {
   public static void main(String[] args) {
	
	List<String> alphabets = Arrays.asList("9","10","123" , "abc");
	
	List<String> names = Arrays.asList("Praneeth","Krishna","Yeswanth");
	
	Stream<String> opstream = Stream.concat(alphabets.stream(), names.stream());
	
	opstream.forEach(str->System.out.print(str+" "));
   }
}