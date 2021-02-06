package c49;

import java.util.LinkedHashSet;
public class LinkedHashSetExample {
     public static void main(String args[]) {
         
         LinkedHashSet<String> lhset = new LinkedHashSet<String>();

         
         lhset.add("afh");
         lhset.add("pgjk");
         lhset.add("nmor");
         lhset.add("sdgk");
         lhset.add("jd");
         lhset.add("dgh");
         System.out.println(lhset);

         
         LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();

         
         lhset2.add(9);
         lhset2.add(71);
         lhset2.add(012);
         lhset2.add(0);
         lhset2.add(0);
         lhset2.add(69);
         System.out.println(lhset2);
    }
}
