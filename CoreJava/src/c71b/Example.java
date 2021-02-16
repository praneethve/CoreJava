package c71b;

interface MyInterface{  
	 
    default void newMethod(){  
        System.out.println("Newly added default method");  
    }  
    void existingMethod(String str);  
}  
interface MyInterface2{  
	 
    default void newMethod(){  
        System.out.println("Newly added default method");  
    }  
    void disp(String str);  
} 
public class Example implements MyInterface, MyInterface2{ 
	
    public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }  
    public void disp(String str){
    	System.out.println("String is: "+str); 
    }
   
    public void newMethod(){  
        System.out.println("Implementation of default method");  
    }  
    public static void main(String[] args) {  
    	Example obj = new Example();
    	
    	
        obj.newMethod();     
  
  
    }  
}