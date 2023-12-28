import java.util.Iterator;

public class SumOfSeries {
	
	//1/1!+2/2!+3/3!+.........+n/n!
	//1/2-1/3+1/4-1/5+1/6-1/7+............1/n
	
//	public static void main(String args[]) {
//			int num=2;
//			double ans = 0;
//	        
//			
//			for (int i = 1; i <= num; i++) 
//	        { 
//            
//	            ans = ans + (double)i / factorial(i); 
//	        } 
//
//	        System.out.println(ans);
//	}
//	
//	static double factorial(int num) {
//		long factorial=1;
//		
//		
//		for(int i=1;i<num;i++) {
//			factorial=factorial*i;
//			
//		}
//		return factorial;
//	}
	
	
//		
//		int num=10;
//		
//		double sum=0;
//		
//		for(int i=2;i<=num;i++) {
//			
//			if(i%2==0) {
//				sum=sum+(double)1/i;
//			}
//			
//			else {
//				sum=sum-(double)1/i;
//			}
//		}
//		
//		System.out.println(sum);
//		
		
		
		
//	}
	

    public static double sumOfSeries(double num) 
    { 
        double res = 0, fact = 1; 
        for (int i = 1; i <= num; i++) 
        { 
            // fact variable store 
            // factorial of the i 
            fact = fact * i; 
  
            res = res + (i / fact); 
        } 
        return(res); 
    } 
  
    // Driver Code 
    public static void main (String[] args) 
    { 
        double n = 5; 
        System.out.println("Sum: " + sumOfSeries(n)); 
    } 

}
