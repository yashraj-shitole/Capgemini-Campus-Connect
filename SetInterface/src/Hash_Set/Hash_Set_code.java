package Hash_Set;

import java.util.ArrayList;
import java.util.HashSet;

public class Hash_Set_code {

	public static void main(String[] args) {
		
		HashSet<Integer> hashObject=new HashSet<>();
		
		hashObject.add(87);
		hashObject.add(90);
		hashObject.add(12);
		hashObject.add(null);
		hashObject.add(2);
		hashObject.add(5);
		
		
		//no duplicates
		//no order
		//only one null value
		
		System.out.println(hashObject);
		

	}

}
