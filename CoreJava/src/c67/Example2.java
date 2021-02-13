package c67;

import java.util.Arrays;
public class Example2 {  

   public static void main(String[] args) {  
	String[] stringArray = { "Praneeth", "Avinash", "Krishna", "Yeswanth"};

	Arrays.sort(stringArray, String::compareToIgnoreCase);
	for(String str: stringArray){
		System.out.println(str);
	}
   }  
}
