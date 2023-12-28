package String_Builder;

public class String_Builder_Code {

	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder("Hello "); 
		System.out.println(sb);

		
		sb.append("World ");  //add data at end
		System.out.println(sb);
		
		
		sb.insert(1,"Hi "); //add data at given position
		System.out.println(sb);
		
		
		sb.replace(1,3,"Welcome "); //Replace at given position 
		System.out.println(sb);
		
		
		sb.delete(1,3);  //delete data at given position
		System.out.println(sb);
		
		
		sb.reverse();   //reverse the string
		System.out.println(sb);
	}

}
