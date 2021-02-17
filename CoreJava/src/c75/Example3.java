package c75;


import java.util.Optional;
 public class Example3 {  
    public static void main(String[] args) {
       
       Optional<String> GOT = Optional.of("Game of Thrones");        
       
       Optional<String> nothing = Optional.empty();

              System.out.println(GOT.orElse("Default Value")); 
       System.out.println(nothing.orElse("Default Value")); 

              System.out.println(GOT.orElseGet(() -> "Default Value")); 
       System.out.println(nothing.orElseGet(() -> "Default Value")); 

  }
}
