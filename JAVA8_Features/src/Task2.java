import java.util.*;
import java.util.stream.Stream;

public class Task2 {


public static void main(String[] args) {
	List<Integer> lst=Arrays.asList(324,526,987,528);
	
	Stream<Integer> str = lst.stream();
	long c=str.filter(n->n.toString().charAt(1)=='2').count();
	System.out.println("Number of integers which has 2 in second position is "+c);
				
				
	
	// to print number which has duplicates in array
	List<Integer> lst1 = Arrays.asList(12,89,23,89,23,20,67);
	
	Set<Integer> set = new HashSet<Integer>();
	lst1.stream().filter(n->!set.add(n)).forEach(n->System.out.println(n));

}

}
