import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list=Arrays.asList(1,6,2,5,7,2,7,5,2,7);
		
		Stream<Integer> stream=list.stream();
		stream.sorted().forEach(n->System.out.print(n+" "));
	
		System.out.println();
		
		
		Stream<Integer> stream1=list.stream();
		stream1.sorted((a, b) -> b - a).forEach(n->System.out.print(n+" "));
	
		System.out.println();
		
		
		Stream<Integer> stream2=list.stream();
		stream2.sorted(Comparator.reverseOrder()).forEach(n->System.out.print(n+" "));
	
		System.out.println();
		
		
		Stream<Integer> stream3=list.stream();
		stream3.sorted().distinct().forEach(n->System.out.print(n+" "));
	
	}

}
