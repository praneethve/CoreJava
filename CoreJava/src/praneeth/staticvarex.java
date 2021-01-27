package praneeth;

public class staticvarex {
	public static String staticvarex= "staticexample";
	public static void main(String args[])
	{
		staticvarex obj= new staticvarex();
		staticvarex obj1= new staticvarex();
		staticvarex obj2= new staticvarex();
		
		System.out.println(obj.staticvarex);
		System.out.println(obj1.staticvarex);
		System.out.println(obj2.staticvarex);
		
		obj2.staticvarex="var example";
		System.out.println(obj.staticvarex);
		System.out.println(obj.staticvarex);
		System.out.println(obj.staticvarex);
	}

}
