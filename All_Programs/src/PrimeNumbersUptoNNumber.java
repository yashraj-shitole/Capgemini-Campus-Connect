import java.util.Iterator;

public class PrimeNumbersUptoNNumber {
	
	public static void main(String args[]) {
		
		int end=100;
		
		for(int i=2;i<=end;i++) {
			int flag=0;
				for(int j=2;j<=i/2;j++) {
					if(i%j==0) {
						flag++;
						break;
					}
				}
			if(flag==0) {
				System.out.println(i);
			}
				
		}
		
	}

}
