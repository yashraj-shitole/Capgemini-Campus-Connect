import java.util.Scanner;

public class Factorial {
	
	public static void main(String args[]) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scanner.nextInt();
		scanner.close();
		long factorial=1;
		
		
		for(int i=1;i<num;i++) {
			factorial=factorial*i;
			
		}
		System.out.println(factorial);
	}

}
