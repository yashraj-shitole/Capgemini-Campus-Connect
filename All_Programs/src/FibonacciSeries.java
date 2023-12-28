import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String args[]) {
		
		int start=0;
		
		int temp=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int end=scanner.nextInt();
		
		for (int i = 0; i <= end; i++) {
			
			System.out.println(start+temp);
			int temp1=temp;
			temp=start;
			start=temp1+start;
			
			
			
		}
		
	}

}
