
package String_Code;

import java.util.Iterator;

public class String_code {


	public static void main(String[] args) {

		
		
		
		String string3="edubridge";
		
		for (int i = string3.length(); i >0 ; i--) {
			System.out.println(string3.substring(0,i));	
			}
		
		for (int i = 2; i <= string3.length(); i++) {
			System.out.println(string3.substring(0,i));
		}
		
		
		
	}

}
