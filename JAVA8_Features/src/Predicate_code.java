import java.util.function.Predicate;

public class Predicate_code {

	public static void main(String[] args) {

		int number=3;
		
		//to check number is greater than10
		Predicate<Integer> predicate1=(n)->n>10;
		System.out.println(predicate1.test(number));
	
		//to check even odd with predicate
		Predicate<Integer> predicate2=(n)->n%2==0;
		
		if (predicate2.test(number)) {
			System.out.println(number+" is even");
		}
		else {
			System.out.println(number+" is odd");
		}
	}

}
