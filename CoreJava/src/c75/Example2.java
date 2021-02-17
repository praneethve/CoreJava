package c75;


import java.util.Optional;
 public class Example2 {  
    public static void main(String[] args) {
   Optional<String> GOT = Optional.of("Game of Thrones");        
       Optional<String> nothing = Optional.empty();           
       if (GOT.isPresent()) {          
          System.out.println("Watching Game of Thrones");       
       } 
       else {            
          System.out.println("I am getting Bored");      
       }
       GOT.ifPresent(s -> System.out.println("Watching GOT is fun!"));                     
       nothing.ifPresent(s -> System.out.println("I prefer getting bored"));
 }
}
