import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=scanner.nextInt();
		int original=num;
		int remainder=1;
		double sumOfCube=0;
		
		while(num!=0){
			remainder=num%10;
			sumOfCube= sumOfCube+(remainder*remainder*remainder);
			num=num/10;
		}
		
		if(sumOfCube==original) {
			System.out.println(original+" is a Armstrong numer");
		}
		else {
			System.out.println(original+" is not a Armstrong number");
		}
	}

}
