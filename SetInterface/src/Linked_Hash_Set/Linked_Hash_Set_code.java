package Linked_Hash_Set;

import java.util.LinkedHashSet;

public class Linked_Hash_Set_code {

	public static void main(String[] args) {

		
		LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
		
		linkedHashSet.add(null);
		linkedHashSet.add(32);
		linkedHashSet.add(55);
		linkedHashSet.add(32); 
		linkedHashSet.add(71);
		
		//no duplicates
		//Order is maintained
		//only one null value

		System.out.println(linkedHashSet);
	}

}
