import java.util.*;
public class Calculator {
	
	
	class Calculation{
		Scanner scanner=new Scanner(System.in);
		double n1,n2,answer;
		
		void addition(){
			n1=scanner.nextDouble();
			n2=scanner.nextDouble();
			answer=n1+n2;
			System.out.print(n1+n2);
			
		}
	}
	
	

	
	public static void main(String args[]){
		
		int choice;
		System.out.println("*************** CALCULATOR ***************");
		System.out.println("Enter your choice");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Division");
		System.out.println("4. Multiplication");
		Scanner scanner=new Scanner(System.in);
		choice=scanner.nextInt();
		
		
		switch (choice) {
		case 1:{
			
			break;
		}
			
			

		default:
			break;
		}
	}
}
