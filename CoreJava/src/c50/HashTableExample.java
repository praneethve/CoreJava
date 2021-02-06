package c50;

import java.util.Hashtable;
import java.util.Enumeration;

public class HashTableExample {
 
 public static void main(String[] args) {
 
   Enumeration names;
   String key;
 
 
   Hashtable<String, String> hashtable = 
              new Hashtable<String, String>();
 
   
   hashtable.put("Key1","mom");
   hashtable.put("Key2","dad");
   hashtable.put("Key3","sis");
   hashtable.put("Key4","bro");
   hashtable.put("Key5","me");
 
   names = hashtable.keys();
   while(names.hasMoreElements()) {
      key = (String) names.nextElement();
      System.out.println("Key: " +key+ " & Value: " +
      hashtable.get(key));
   }
 }
}
