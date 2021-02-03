package c15;

class ExceptionDemo3
{
   public static void main(String args[])
   {
      try{
	 int num=Integer.parseInt ("Praneeth") ;
	 System.out.println(num);
      }catch(NumberFormatException e){
	  System.out.println("Number format exception occurred");
       }
   }
}
