package c6;


public class JavaExample1 extends Teacher{
	   String mainSubject = "ComputerScience";
	   public static void main(String args[]){
		JavaExample1 obj = new JavaExample1();
			System.out.println(obj.getCollegeName());
		System.out.println(obj.getDesignation());
		System.out.println(obj.mainSubject);
		obj.does();
	   }
	}
