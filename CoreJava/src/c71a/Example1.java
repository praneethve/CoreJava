package c71a;



interface MyInterface1{  
    
    default void newMethod1(){  
        System.out.println("Newly added default method");  
    }  
    
   
    static void anotherNewMethod(){
    	System.out.println("Newly added static method");
    }
   
    void existingMethod(String str);  
}  
public class Example1 implements MyInterface1{ 
	
    public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }  
    public static void main(String[] args) {  
    	Example1 obj = new Example1();
    	
    	
        obj.newMethod1();     
        
        MyInterface1.anotherNewMethod();
        
        obj.existingMethod("Java 8 is easy to learn"); 
        
  
    }  
}
