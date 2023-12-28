import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String original=scanner.nextLine();	
		String string=original.toUpperCase();
		String reverse="";
		
		for(int i=string.length()-1;i>=0;i--) {
			
			reverse=reverse+string.charAt(i);
		}
		
		if(string.equals(reverse)){
			System.out.println(original+" is a palindrom");
		}
		else {
			System.out.println(original+" is not a palindrom");
		}
	}

}
