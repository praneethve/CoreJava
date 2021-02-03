package c16;

	import java.util.ArrayList;
	public class JavaExample1 {
	   public static void main(String[] args) {
	      ArrayList<String> names = new ArrayList<String>();
	      names.add("mom");
	      names.add("dad");
	      names.add("sister");
	      names.add("brother");
	      names.set(0, "me");
	      System.out.println(names);
	   }
	}
