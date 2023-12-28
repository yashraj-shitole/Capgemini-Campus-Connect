package Hash_Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;import java.util.Map;

public class Occurence_of_intergers_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int[] a= {1,2,4,2,5,3,2,8,2,8,2};
		
		ArrayList<Integer> al=new ArrayList<>();
		
		for (int i : a) {
			al.add(i);
		}
		
		HashMap<Integer, Integer> hMap=new HashMap<>();
		for(int i=0;i<al.size();i++) {
			hMap.putIfAbsent(al.get(i), Collections.frequency(al, al.get(i)));
		}
		
		
		System.out.println(hMap);
		
		
		
		//custom output
	for(Map.Entry<Integer, Integer> m:hMap.entrySet()) {
		System.out.println(m.getKey()+"->"+m.getValue());
	}
	}
	
	
	
	

}
