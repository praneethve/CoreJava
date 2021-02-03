package c15;

class ExceptionDemo2
{
   public static void main(String args[])
   {
      try{
        int a[]=new int[10];
        a[11] = 10;
      }
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println ("Array Index Out Of Bound");
      }
   }
}
