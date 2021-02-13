package c67;

@FunctionalInterface 
interface MyInterface{  
    void display();  
}  
public class Example {  
    public void myMethod(){  
	System.out.println("Instance Method");  
    }  
    public static void main(String[] args) {  
	Example obj = new Example();   

	MyInterface ref = obj::myMethod;  
	ref.display();  
    }  
}
