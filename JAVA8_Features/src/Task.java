import java.util.Scanner;
import java.util.function.Function;
import java.util.jar.Attributes.Name;

@FunctionalInterface 
interface Validate{
	boolean ValidateUser(String name, String pass);
}
public class Task {

	public static void main(String[] args) {
	
//		Using Lambda Expression , and Functional interface
//		vaidate username and password
//
//		@FunctionalInterface
//		interface Validate{
//		    boolean validateUser(String uname, String upass)
//		}
//
//		uname="admin" 
//		upass="admin123"
//
//		Validuser
//
//		invalid user

		

		Validate validate=(name,pass)->{
			return name.equals("admin") && pass.equals("admin123");
		};
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter user name");
		String name=scanner.nextLine();
		System.out.println("Enter password");
		String pass=scanner.nextLine();
		boolean val=validate.ValidateUser(name, pass);
		
		if (val) {
			System.out.println("login successful");
		}
		else {
			System.out.println("Failed");
		}
		

	}

}


