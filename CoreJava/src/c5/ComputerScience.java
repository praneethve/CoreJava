package c5;

class Teacher {
	   String designation = "Teacher";
	   String collegeName = "visit";
	   void does(){
		System.out.println("Teaching");
	   }
	}

	public class ComputerScience extends Teacher{
	   String mainSubject = "DBMS";
	   public static void main(String args[]){
		ComputerScience obj = new ComputerScience();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		System.out.println(obj.mainSubject);
		obj.does();
	   }
	}
