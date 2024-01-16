import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_API {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,7,8};
		
		List<Integer> aList=Arrays.asList(1,2,3,4,5,6,7,100,22,45,241,45);

		
		//Using stream
		IntStream is=Arrays.stream(a);
		is.forEach(n->System.out.print(n+" "));

		System.out.println("\n");
		
		//Using List
		
		Stream<Integer> stream=aList.stream();
		stream.forEach(n->System.out.print(n+" "));
		
		System.out.println("\n");

		//Using stream for String List iteration
		
		List<String> nameList=Arrays.asList("Yashraj","Ranjeet","Shitole");	
		Stream<String> stream2=nameList.stream();
		stream2.forEach(n->System.out.print(n+" "));
		
		
		System.out.println("\n");
		
		
		
		
		//Using stream to get even numbers
		Predicate<Integer> evenFilterPredicate=(n)->n%2==0;

		Stream<Integer> stream3=aList.stream();
		stream3.filter(evenFilterPredicate).collect(Collectors.toList()).forEach(n->System.out.print(n+" "));
		
		
		System.out.println("\n");

		//Using stream to get odd numbers
		
		Stream<Integer> stream4=aList.stream();
		stream4.filter(n->n%2!=0).collect(Collectors.toList()).forEach(n->System.out.print(n+" "));
		
		
		System.out.println("\n");

		//using stream to print all numbers greater than 10
		
		Stream<Integer> stream5=aList.stream();
		stream5.filter(n->n>10).collect(Collectors.toList()).forEach(n->System.out.print(n+" "));
		
		
		System.out.println("\n");
		
		
		//sum of all odd numbers using stream
		Stream<Integer> stream6=aList.stream();
		
		int sumOfOddNumbers = stream6.filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
		
		System.out.println(sumOfOddNumbers);
		
		System.out.println("\n");

		
		//map use in stream
		Stream<String> stream7=nameList.stream();
		stream7.map(n->n.toUpperCase()).sorted().forEach(n->System.out.print(n+" "));
	}

}
