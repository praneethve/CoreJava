package c70;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Praneeth Vemulaplli","YEswanth","Vishnu","Krishna");

        List<String> longnames = names.stream()  
                .filter(str -> str.length() > 6 && str.length() < 8) 
                .collect(Collectors.toList());  

        longnames.forEach(System.out::println);           

    }

}
