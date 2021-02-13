package c67;

@FunctionalInterface 
interface MyInterface1{  
    Hello display(String say);  
}  
class Hello{  
    public Hello(String say){  
        System.out.print(say);  
    }  
}  
public class Example3 {  
    public static void main(String[] args) { 
        MyInterface1 ref = Hello::new;  
        ref.display("Hi Praneeth");  
    }  
}
