package c48;

import java.util.TreeSet;
public class TreeSetExample {
     public static void main(String args[]) {
         
         TreeSet<String> tset = new TreeSet<String>();

         
         tset.add("ABC");
         tset.add("String");
         tset.add("Test");
         tset.add("Pen");
         tset.add("Ink");
         tset.add("Jack");

         
         System.out.println(tset);

         
         TreeSet<Integer> tset2 = new TreeSet<Integer>();

         
         tset2.add(8);
         tset2.add(9);
         tset2.add(11);
         tset2.add(0);
         tset2.add(36);
         tset2.add(22);
         System.out.println(tset2);
    }
 }
