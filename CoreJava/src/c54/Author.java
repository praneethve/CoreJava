package c54;

public class Author implements Comparable<Author> {

	  String firstName;
	  String lastName;
	  String bookName;
	  Author(String first, String last, String book){
		this.firstName = first;
		this.lastName = last;
		this.bookName = book;
	  }
	  
	  public int compareTo(Author au){
	    
	     int last = this.lastName.compareTo(au.lastName);
	    
	     return last == 0 ? this.firstName.compareTo(au.firstName) : last;
	  }
	}