package c75;
import java.util.Optional; 
public class Example4 {   
 public static void main(String[] args) {
         
    Optional<String> GOT = Optional.of("Game of Thrones");       
        
    Optional<String> nothing = Optional.empty();
    System.out.println(GOT.map(String::toLowerCase));        
    System.out.println(nothing.map(String::toLowerCase));
    Optional<Optional<String>> anotherOptional = Optional.of(Optional.of("BreakingBad"));        
    System.out.println("Value of Optional object"+anotherOptional);        
    System.out.println("Optional.map: "+anotherOptional.map(gender -> gender.map(String::toUpperCase)));               
    System.out.println("Optional.flatMap: "+anotherOptional.flatMap(gender -> gender.map(String::toUpperCase)));
 }
}
