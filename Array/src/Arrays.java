import java.util.Iterator;

public class Arrays {

	public static void main(String args[]) {
		
		int[] array1={22,27,30,24};//
		int[] array2={23,33,34,22};
		int[] array3= new int[4];
		
		int[][] array4= {{2,2,5,3,2},{2,5,2,6,7,},{3,3,7,5,8}}; //2D array
		
		int[][] array6=new int[2][]; //2d jagged array declaration
		int[][] array7= {{3,2,5,4,2},{2,3,6},{2,5,4,7}}; //2d jagged array initialization
		
		for(int i=0;i<array3.length;i++) {
			
			array3[i]=array1[i]+array2[i];
		}
		
		printArray(array7);
				
	}
	
	
	
	//funtion to print 1d array
	
	static void printArray(int[] a) {
		
			for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+" ");
		}
		
	}
	
	//function to print 2d array
	static void printArray(int[][] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println();
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
		}
	}
	
	
	
	
}
