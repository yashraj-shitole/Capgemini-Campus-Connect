

import java.util.*;

public class Largestnumber {
	

		public static void main(String[] args) {
			int i,j, l;
			Scanner sc= new Scanner(System.in);
			System.out.println("enter 2 numbers");
			i= sc.nextInt();
			j= sc.nextInt();
			
			l=Largestnum(i,j);
			System.out.println("The largest of "+i+ " and "+j+ " is "+l);
			

	}
		
	
 static int Largestnum(int a, int b) {
	
	return (a>b) ?a:b;

}
 
 static int Largestnum(int a, int b ,int c) {
	 return (a>b && a>c)?a:(b>a && b>c)?b:c;
 }

}
