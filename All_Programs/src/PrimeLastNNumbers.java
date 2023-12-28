
public class PrimeLastNNumbers {
	  public static void main(String[] args) {
		  
	        int lastPrime3 = 0;
	        int lastPrime2 = 1;
	        int lastPrime1 = 2;

	        for (int i = 2; i <= 100; i++) {
	            if (isPrime(i)) {
	                lastPrime3 = lastPrime2;
	                lastPrime2 = lastPrime1;
	                lastPrime1 = i;
	            }
	        }

	        System.out.println(lastPrime3);
	        System.out.println(lastPrime2);
	        System.out.println(lastPrime1);
	    }

	    private static boolean isPrime(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= n/2; i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}


