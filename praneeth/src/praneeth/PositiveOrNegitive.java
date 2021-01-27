package praneeth;
import java.util.Scanner;
public class PositiveOrNegitive {
	public static void main(String args [])
	{
	int a;
	Scanner scan = new Scanner(System.in);
    System.out.println("enter the value");
	a = scan.nextInt();
	if(a>0)
			System.out.println(a+ " number is positive");
		else if(a<0)
		System.out.println(a+ " number is negitive");
		else
			System.out.println(a+ " number is zero");
		
    
	}

}
		