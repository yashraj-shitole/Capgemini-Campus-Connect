import java.util.Iterator;

public class Patterns {



		public static void main(String[] args) {
		
//			     int r=4, c=4;
//			     
//			     for(int i=1;i<=r;i++) {
//			    	 for(int j=1;j<=c;j++) {
//			    		 System.out.print(i+" ");
//			    	 }
//			    	 System.out.println();
//			    		 
//			     }
			
			pyramidPattern(4);
//			leftSideTrianglePattern(4);
//			rightSideTrianglePattern(4);
			
			
			
			
			     
		}
	
		
		static void pyramidPattern(int row) {
			
			for(int i=0;i<=row-1;i++) {
				for(int j =1;j<row-i;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<=i;j++) {
					System.out.print("*");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			
		}
		
		
		static void rightSideTrianglePattern(int row) {
			for(int i=0;i<=row;i++) {
				for(int j=0;j<row-i;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<i;j++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
			
		}
		
		
		
		static void leftSideTrianglePattern(int row){
			
			for(int i=0;i<=row;i++) {
				
				for(int j=0;j<i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}

}
