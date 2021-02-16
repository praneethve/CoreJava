package c71;

interface MyInterface{  

    default void newMethod(){  
        System.out.println("Newly added default method");  
    }  

    void existingMethod(String str);  
}  
public class Example implements MyInterface{ 

    public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }  
    public static void main(String[] args) {  
    	Example obj = new Example();
    	
         obj.newMethod();     
         obj.existingMethod("Java 8 is easy to learn"); 
  
    }  
}
