package c66;

import java.util.*;  
public class Example3{  
    public static void main(String[] args) {       
       List<String> list=new ArrayList<String>();  
       list.add("Praneeth");         
       list.add("Avinash");       
       list.add("Yeswanth");         
       list.add("Krishna");         
       list.add("Vishnu");                
       list.forEach((names)->System.out.println(names));     
    }  
}
