package c13;
class EncapsulationDemo{
    private int ssn;
    private String empName;
    private int empAge;
    public int getEmpSSN(){
        return ssn;
    }
    public String getEmpName(){
        return empName;
    }
    public int getEmpAge(){
        return empAge;
    }
    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpSSN(int newValue){
        ssn = newValue;
    }
}
public class EncapsTest{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("Praneeth Vemulapalli");
         obj.setEmpAge(23);
         obj.setEmpSSN(12370);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee SSN: " + obj.getEmpSSN());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}
