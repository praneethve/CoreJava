package c14;

class MyException1 extends Exception{
	   String str1;
	   	   MyException1(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException accurred "+str1) ;
	   }
	}

	class Example{
	   public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
				throw new MyException1("This is My error Message");
		}
		catch(MyException1 exp){
			System.out.println("CatchBlock") ;
			System.out.println(exp) ;
		}
	   }
	}
