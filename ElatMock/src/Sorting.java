import java.util.*;


public class Sorting {

	public static void main(String[] args) {
		  //Write a Java program to sort a given array list.
		  List<String> list = new ArrayList<String>();
		  list.add("Red");
		  list.add("Green");
		  list.add("Orange");
		  list.add("White");
		  list.add("Black");
		  
		    
		    System.out.println("list before sorting"+list);
		    Collections.sort(list);
		    System.out.println("list after sorting"+list);
		    Collections.sort(list, Collections.reverseOrder());
		    System.out.println("list after sorting"+list);

		    }
		 }