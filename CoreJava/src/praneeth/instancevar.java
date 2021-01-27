package praneeth;

public class instancevar {
	 String instancevarex= "instanceexample";
		public static void main(String args[])
		{
			instancevar obj= new instancevar();
			instancevar obj1= new instancevar();
			instancevar obj2= new instancevar();
			
			System.out.println(obj.instancevarex);
			System.out.println(obj1.instancevarex);
			System.out.println(obj2.instancevarex);
			
			obj2.instancevarex="instance ";
			System.out.println(obj.instancevarex);
			System.out.println(obj1.instancevarex);
			System.out.println(obj2.instancevarex);
		}

	}

