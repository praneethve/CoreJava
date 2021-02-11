package c58;

import java.util.regex.*;  
class RegexExample2{  
public static void main(String args[]){  
	String text = "ThisIsPraneeth.ItISMyWebsite";
	String patternString = "is";
	Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
	String[] myStrings = pattern.split(text);
	for(String temp: myStrings){
	    System.out.println(temp);
	}
	System.out.println("Number of split strings: "+myStrings.length);
}}
