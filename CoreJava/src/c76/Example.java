package c76;

import java.util.Arrays; 
public class Example {  
   public static void main(String[] args) {
	int numbers[] = {22, 89, 1, 32, 19, 5};
	Arrays.parallelSort(numbers);
	Arrays.stream(numbers).forEach(n->System.out.print(n+" "));
    }
}
