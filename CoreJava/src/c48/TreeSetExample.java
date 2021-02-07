package c48;

import java.util.TreeSet;
public class TreeSetExample {
     public static void main(String args[]) {
         
         TreeSet<String> tset = new TreeSet<String>();

         
         tset.add("ABC");
         tset.add("String");
         tset.add("Test");
         tset.add("Pen");
         tset.add("Ink");
         tset.add("Jack");

         
         System.out.println(tset);

         
         TreeSet<Integer> tset2 = new TreeSet<Integer>();

         
         tset2.add(8);
         tset2.add(9);
         tset2.add(11);
         tset2.add(0);
         tset2.add(36);
         tset2.add(22);
         System.out.println(tset2);
         TreeSet<Person> tset3 = new TreeSet<Person>();
         Person p1 = new Person();
         p1.setFirstname("praneeth");
         p1.setLastname("vemulapalli");
         Person p2 = new Person();
         p2.setFirstname("Yeswanth");
         p2.setLastname("Maram");
         Person p3 = new Person();
         p3.setFirstname("Krishna");
         p3.setLastname("Kolli");
      tset3.add(p1);
      tset3.add(p2);
      tset3.add(p3);
    System.out.println(tset3);
    }
 }
class Person implements Comparable {
	private String firstname;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	private String lastname;
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return firstname.compareTo(((Person)o).getFirstname());
		
		
	}	
	public String toString() {
		return firstname+" "+lastname;  
	}
}