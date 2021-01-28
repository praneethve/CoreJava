package c5;

class Superclass
{
   int num = 100;
}

class Subclass extends Superclass
{
    int num = 69;
    void printNumber(){
	System.out.println(num);
    }
    public static void main(String args[]){
	Subclass obj= new Subclass();
	obj.printNumber();	
    }
}