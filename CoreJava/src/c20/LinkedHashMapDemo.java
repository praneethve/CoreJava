package c20;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
public class LinkedHashMapDemo {
    public static void main(String args[]) {
                  LinkedHashMap<Integer, String> lhmap = 
                 new LinkedHashMap<Integer, String>();

         
         lhmap.put(22, "MOM");
         lhmap.put(33, "Dad");
         lhmap.put(1, "Son");
         lhmap.put(2, "Bro");
         lhmap.put(100, "Me");

         
         Set set = lhmap.entrySet();

         
         Iterator iterator = set.iterator();
         while(iterator.hasNext()) {
            Map.Entry me = (Map.Entry)iterator.next();
            System.out.print("Key is: "+ me.getKey() + 
                    "& Value is: "+me.getValue()+"\n");
         }
    }
}