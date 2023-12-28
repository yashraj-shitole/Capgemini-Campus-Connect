package String_Buffer;

public class String_Buffer_Code {

	public static void main(String[] args) {
		//StringBuffer objects are mutable, meaning that you can change the contents of the buffer without creating a new object.
		//The initial capacity of a StringBuffer can be specified when it is created, or it can be set later with the ensureCapacity() method.
		//The append() method is used to add characters, strings, or other objects to the end of the buffer.
		//The insert() method is used to insert characters, strings, or other objects at a specified position in the buffer.
		//The delete() method is used to remove characters from the buffer.
		//The reverse() method is used to reverse the order of the characters in the buffer.
		  StringBuffer sb = new StringBuffer();
	        sb.append("Hello");
	        sb.append(" ");
	        sb.append("world");
	        String message = sb.toString();
	        System.out.println(message);
	}

}
