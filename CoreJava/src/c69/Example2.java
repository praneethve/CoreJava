package c69;

import java.util.stream.*;  
public class Example2 {  
    public static void main(String[] args){  
        Stream.iterate(1, count->count+1)  
        .filter(number->number%3==0)  
        .limit(10)  
        .forEach(System.out::println);  
    }  
}