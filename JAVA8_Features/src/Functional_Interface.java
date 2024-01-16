import java.util.function.Function;

public class Functional_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, Integer> length=(s)->s.length();
		
		System.out.println("Length of string is "+length.apply("Heelo"));

		//Function interface to
		Function<String, String> lowerToUpper=(s)->s.toUpperCase();
		System.out.println("String: Hello everyone");
		System.out.println(lowerToUpper.apply("Hello everyone"));
	}

}
