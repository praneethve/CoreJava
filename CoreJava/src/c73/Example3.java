package c73;

import java.util.stream.Collectors;  
import java.util.List;  
import java.util.ArrayList; 
class Student2{  
   int id;   
   String name;   
   int age;
   public Student2(int id, String name, int age) {  
      this.id = id;   
      this.name = name; 
      this.age = age;  
   } 
}  
public class Example3 {  
   public static void main(String[] args) {  
      List<Student> studentlist = new ArrayList<Student>();    
      studentlist.add(new Student(11,"Praneeth",22));         
      studentlist.add(new Student(22,"Alpati",18));         
      studentlist.add(new Student(33,"Vishnu",22));         
      studentlist.add(new Student(44,"Krishna",23));         
      studentlist.add(new Student(55,"Yeswanth",18));  
      Double avgAge = studentlist.stream()   
          .collect(Collectors.averagingInt(s->s.age));  
      System.out.println("Average Age of Students is: "+avgAge);
   }  
}
