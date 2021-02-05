package c18;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class Deatils {

   public static void main(String args[]) {

      
      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

      
      hmap.put(12, "mom");
      hmap.put(2, "dad");
      hmap.put(7, "sis");
      System.out.println("string is" +hmap.put(49, "Bro"));
      hmap.put(3, "me");
      System.out.println("string is" +hmap.put(49, "praneeth"));
      
      Set set = hmap.keySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Integer key =  (Integer)iterator.next();
         System.out.print("key is: "+ key + " & Value is: ");
         System.out.println(hmap.get(key));
      }

      
      String var= hmap.get(2);
      System.out.println("Value at index 2 is: "+var);

      System.out.println(" element 90 is: "+hmap.remove(90));
      System.out.println(" element 3 is: "+hmap.remove(3));
      System.out.println("Map key and values after removal:");
      Set set2 = hmap.entrySet();
      Iterator iterator2 = set2.iterator();
      while(iterator2.hasNext()) {
          Map.Entry mentry2 = (Map.Entry)iterator2.next();
          System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
          System.out.println(mentry2.getValue());
       }

   }
}
