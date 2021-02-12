package c61;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
public class SendClass
{
  public static void main(String args[])
  {
    Student obj = new Student(69, 23, "PraneethVemulapalli", "Tanuku", 6);
    try{ 
      FileOutputStream fos = new FileOutputStream("Student.ser"); 
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(obj);
      oos.close();
      fos.close();
      System.out.println("Serialzation Done!!");
   }catch(IOException ioe){
      System.out.println(ioe);
    }
  }
}
