import java.util.Scanner;

public class ArrayEvenOdd {
	
	public static void main(String args[]) {
		
		
		System.out.println("enter number of elements in array");
		Scanner scanner=new Scanner(System.in);
		
		int length=scanner.nextInt();
		
		System.out.println("Enter "+length+" elements of array");
		int[] array=new int[length];
		
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
		}
		
		System.out.print("Even numbers in array are:  ");
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2==0) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println();
		System.out.print("Odd numbers in array are:  ");
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2!=0) {
				System.out.print(array[i]+" ");
			}
		}
		
//		for (int i : array) {
//			System.out.print(i+" ");
//		}
		scanner.close();
	}

}
