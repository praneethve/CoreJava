package c16;
import java.util.*;
public class Example3 {
   public static void main(String args[]) {
      ArrayList<String> obj = new ArrayList<String>();
      obj.add("MOM");
      obj.add("dad");
      obj.add("sister");
      obj.add("Brother");
      obj.add("me");

      
      System.out.println("Original ArrayList:");
      for(String str:obj)
         System.out.println(str);

       obj.add(0, "hello");
      obj.add(1, "hi");

      
      System.out.println("ArrayList after add operation:");
      for(String str:obj)
         System.out.println(str);


      obj.remove("Grand father"); 
      obj.remove("Grand Mother"); 

      System.out.println("ArrayList after remove operation:");
      for(String str:obj)
         System.out.println(str);

            obj.remove(1); 
          System.out.println("Final ArrayList:");
      for(String str:obj)
         System.out.println(str);
   }
}