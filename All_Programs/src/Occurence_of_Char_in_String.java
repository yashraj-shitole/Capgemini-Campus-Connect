

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Occurence_of_Char_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		String string="Yashraj";
		
		ArrayList<Character> aList=new ArrayList<>();
		
		for(int i=0;i<string.length();i++) {
			aList.add(string.charAt(i));
		}
		
		System.out.println(aList);
		
		HashMap<Character, Integer> hMap=new HashMap<>();
		
		for (int i = 0; i < aList.size(); i++) {
			hMap.putIfAbsent(aList.get(i), Collections.frequency(aList, aList.get(i)));
		}
		
		
		
		for (Entry<Character, Integer> entry : hMap.entrySet()) {
			Character  key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key+"->"+val);
			
		}
	}

}
