package Tree_Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Set_Code {

	public static void main(String[] args) {


		TreeSet<Integer> tSet=new TreeSet<>();
		
		tSet.add(5);
		tSet.add(3);
		tSet.add(4);
		tSet.add(2);
		tSet.add(2);
		
		//No null values
		//No duplicates 
		//maintaining sorted Descending order
		
		System.out.println(tSet);
		
		
		
		Iterator<Integer> iterator=tSet.descendingIterator(); 
		
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}

}
