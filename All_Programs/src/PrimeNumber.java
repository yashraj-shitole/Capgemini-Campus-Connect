import java.util.Iterator;

public class PrimeNumber {
	
	public static void main(String args[]) {
		
		
		int num=9;
		int flag=0;
		
		for(int i=2;i<=num/2;i++) {
			if (num%i==0) {
				flag=1;
			}
		}
		
		if (flag==1) {
			System.out.println("Not a Prime number ");
		}
		else {
			System.out.println("Number is Prime");
		}
	}
}
