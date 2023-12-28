import java.util.*;

public class SearchElementFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7. Write a Java program to search for an element in an array list.

		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  
		    if (list_Strings.contains("Red")) {
		    System.out.println("Found the element");
		    } else {
		    System.out.println("There is no such element");
		    }
		 }
		}
