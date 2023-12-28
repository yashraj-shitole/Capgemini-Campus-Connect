
public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer stringName=new StringBuffer("HELLO WORLD");
		
		//1.  .append(value to add)
		System.out.println(stringName.append("!!"));
		
		//2. insert(index number , value to insert)
		System.out.println(stringName.insert(5, " MY"));
		
		//3. .replace(starting index,endindex+1,value to insert)
		System.out.println(stringName.replace(0, 5, "WELCOME"));
		
		//4. delete(starting index, endindex+1)
		System.out.println(stringName.delete(7, 10));
		
		//5. .reverse()
		System.out.println(stringName.reverse());
		stringName.reverse();
		
		//6. .capacity()
		System.out.println(stringName.capacity());
		
		//7. .ensureCapacity(value to increase capacity) 
		stringName.ensureCapacity(35);
		System.out.println(stringName.capacity());
		
		//8. chatAt(index number)
		System.out.println(stringName.charAt(5));
		
		//9. length()
		System.out.println(stringName.length());
		
		//10. deleteCharAt(index number)
		System.err.println(stringName.deleteCharAt(1));
		
		//11. .delete()
		System.out.println(stringName.delete(0, 7));

		
	}

}
