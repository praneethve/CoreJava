package c73;

import java.util.stream.Collectors;  
import java.util.List;  
import java.util.Set; 
import java.util.ArrayList;  
class Student1 {    
   int id;     
   String name;  
   int age;           
   public Student1(int id, String name, int age) {   
       this.id = id;         
       this.name = name;       
       this.age = age;      
   } 
}  
public class Example2 {     
   public static void main(String[] args) {       
      List<Student> studentlist = new ArrayList<Student>();               
      studentlist.add(new Student(11,"Praneeth",22));         
      studentlist.add(new Student(22,"Alpati",18));         
      studentlist.add(new Student(33,"Vishnu",22));         
      studentlist.add(new Student(44,"Krishna",23));         
      studentlist.add(new Student(55,"Praneeth",18));                         
      Set<Student> students = studentlist.stream().filter(n-> n.id>22).collect(Collectors.toSet());
      for(Student stu : students) {
    	  System.out.println(stu.id+" "+stu.name+" "+stu.age); 
      }           
   } 
}
