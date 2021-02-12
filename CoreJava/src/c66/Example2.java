package c66;

interface StringConcat {

    public String sconcat(String a, String b);
}
public class Example2 {

   public static void main(String args[]) {
    	StringConcat s = (str1, str2) -> str1 + str2;
        System.out.println("Result: "+s.sconcat("Praneeth ", "Vemulapalli"));
    }
}
