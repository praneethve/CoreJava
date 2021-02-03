package c13;
interface Example1{
  public void display1();
}
interface Example2 {
  public void display2();
}
interface Example3 extends Example1,Example2{
}
class Example4 implements Example3{
  public void display1(){
      System.out.println("display2 method");
  }
  public void display2(){
      System.out.println("display3 method");
  }
}
class Demo3{
  public static void main(String args[]){
      Example4 obj=new Example4();
      obj.display1();
  }
}
