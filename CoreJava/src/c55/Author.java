package c55;

public class Author implements Comparable<Author> {
	  String firstName; 
	  String bookName; 
	  int auAge; 
	  Author(String first, String book, int age){ 
	    this.firstName = first; 
	    this.bookName = book; 
	    this.auAge = age; 
	  } 
	  public String getFirstName() { 
	    return firstName; 
	  }
	  public void setFirstName(String firstName) { 
	    this.firstName = firstName; 
	  }
	  public String getBookName() { 
	    return bookName; 
	  }
	  public void setBookName(String bookName) { 
	    this.bookName = bookName; 
	  }
	  public int getAuAge() { 
	    return auAge; 
	  }
	  public void setAuAge(int auAge) { 
	    this.auAge = auAge; 
	  } 
	  	  
	  public int compareTo(Author au){         
	    return this.firstName.compareTo(au.firstName);   
	  }
	}
