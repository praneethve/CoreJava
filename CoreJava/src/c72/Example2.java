package c72;

import java.util.List;
import java.util.ArrayList;
public class Example2 {
   public static void main(String[] args) {
      List<String> names = new ArrayList<String>();
      names.add("Praneeth");
      names.add("Yeswanth");
      names.add("Mani");
      names.add("Krishna");
      names.add("Manirathnam");
      names.stream() 
     .filter(f->f.startsWith("M")) 
     .forEach(System.out::println);
   }
}
