package c54;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
  public static void main(String[] args) {
   
    int[] arr = {11,55,22,0,89};
    Arrays.sort(arr);
    System.out.print("Sorted Int Array: ");
    System.out.println(Arrays.toString(arr));
        
    
    System.out.print("Sorted String Array: ");
    String[] names = {"Steve", "Ajeet", "Kyle"};
    Arrays.sort(names);
    System.out.println(Arrays.toString(names));
        
     
     System.out.print("Sorted List: ");
      List<String> fruits = new ArrayList();
     fruits.add("Orange");
     fruits.add("Banana");
     fruits.add("Apple");
     fruits.add("Guava");
     fruits.add("Grapes");
     Collections.sort(fruits);
     for(String str : fruits) System.out.print(str+ ", ");
  }
}
