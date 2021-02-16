package c73;

import java.util.stream.Collectors;  
import java.util.List;  
import java.util.ArrayList;  
class Student{  
   int id;     
   String name;    
   int age;         
   public Student(int id, String name, int age) {  
        this.id = id;    
        this.name = name;         
        this.age = age;     
   } 
}  
public class Example1 {  
   public static void main(String[] args) {    
      List<Student> studentlist = new ArrayList<Student>();   
           
      studentlist.add(new Student(11,"Avinsh",22));      
      studentlist.add(new Student(22,"Yeswanth",18));        
      studentlist.add(new Student(33,"Alpati",22));        
      studentlist.add(new Student(44,"Praneeth",23));         
      studentlist.add(new Student(55,"Vishnu",18));                  
      List<String> names = studentlist.stream().map(n->n.name).collect(Collectors.toList());
      System.out.println(names);         
   }  
}
