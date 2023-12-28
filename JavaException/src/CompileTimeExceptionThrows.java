import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompileTimeExceptionThrows {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		  //Input Data
			int age;
			String name;
			float salary;
			
			//Scanner sc = new Scanner(System.in);
			
			InputStreamReader is = new InputStreamReader(System.in);
			
			BufferedReader br = new BufferedReader(is);
			//read->reads ascii value
			//readLine() ->read a string
			
			System.out.println("Enter age");
			age = Integer.parseInt(br.readLine()); //23
			
			System.out.println("Enter name");
			name = br.readLine();
			
			System.out.println("Enter salary");
			salary =Float.parseFloat( br.readLine()); //"7645.34"
			
			System.out.println("Name ="+name);
			System.out.println("Age ="+age);
			System.out.println("Salary="+salary);
			
			

		}


}
