
public class PalindromNumber {
	
	public static void main(String args[]) {
		
		int num=121;
		
		int nextPalindrome=0;

				PalindromNumber palindromNumber=new PalindromNumber();
		
		
		
		for(int i=num+1;nextPalindrome==0;i++) {
			if (palindromNumber.isPalindrom(i)) {
				nextPalindrome=i;
			}
		}
		System.out.println(nextPalindrome);
		
		
	}

	
	 boolean isPalindrom(int num) {
		
		int number=num;
		int reverse=0;
		
		while (number!=0) {
			
			int remain=number%10;
			reverse=reverse*10+remain;
			number/=10;
			
		}
		
		if (num==reverse) {
			return true;
			
		}

		return false;
		
		
	}
}
