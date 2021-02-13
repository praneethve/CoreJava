package c68;

@FunctionalInterface
interface MyFunctionalInterface {

    public int addMethod(int a, int b);
}
public class Example {

   public static void main(String args[]) {
       	MyFunctionalInterface sum = (a, b) -> a + b;
        System.out.println("Result: "+sum.addMethod(12, 100));
    }
}
