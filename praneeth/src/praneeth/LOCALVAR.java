package praneeth;

public class LOCALVAR {
	public String myvar=" hi";

	public void MyMethod()
	{
		String myvar ="inside method";
		System.out.println(myvar);
	}
	
	public static void main(String args[])
	{
		LOCALVAR obj = new LOCALVAR();
		System.out.println("calling method");
		obj.MyMethod();
		System.out.println(obj.myvar);
		
	}

}
