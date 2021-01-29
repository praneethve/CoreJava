package c9;

class SimpleCalculator
{
    int add(int a, int b)
    {
         return a+b;
    }
    int  add(int a, int b, int c)  
    {
         return a+b+c;
    }
}
public class Demo
{
   public static void main(String args[])
   {
	   SimpleCalculator obj = new SimpleCalculator();
       System.out.println(obj.add(50, 10));
       System.out.println(obj.add(10, 10, 30));
   }
}