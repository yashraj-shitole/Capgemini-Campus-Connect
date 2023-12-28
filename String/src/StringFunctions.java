

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="Hello World";
				
				// 1. toLowerCase()
				System.out.println(string.toLowerCase());
				
				//2. toUpperCase
				System.out.println(string.toUpperCase());
				
				//3. length()
				System.out.println(string.length());
				
				//4. replace(old,new)
				System.out.println(string.replace("Hello","Welcome"));
				
				//5. startWith()
				System.out.println(string.startsWith("Hello"));
				
				//6. charAt(index)
				char c=string.charAt(4);
				System.out.println(c);
				
				//7 intern() new instance is created at aString constant pool
				String string2=string.intern();
				System.out.println(string2);
				

	}

}
