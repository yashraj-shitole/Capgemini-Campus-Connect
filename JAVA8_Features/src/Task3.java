import java.awt.color.ColorSpace;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> aList= Arrays.asList(1,2,3,4,5,6,7,100,22,45,241,45);

		Stream<Integer> stream1=aList.stream();
		
		stream1.forEach(n->System.out.print(n+" "));
	
		System.out.println();

		Stream<Integer> stream5=aList.stream();
		stream5.filter(n->n>10).forEach(n->System.out.print(n+" "));
		
		System.out.println();
		
		List<String> names= Arrays.asList("Padma","Thivya","Akash","Yashraj");
		
		Stream<String> stream3=names.stream();
		
		stream3.filter(n->n.length()>5).forEach(n->System.out.print(n+" "));
		
		
//		to add ColorSpace between letters of word
	      String input = "CAPGEMINI";
	      String s= input.chars()
	          .mapToObj(c -> (char) c + " ")
	          .collect(Collectors.joining())
	          .trim();
	      
	      System.out.println(s);
		
	}

}
