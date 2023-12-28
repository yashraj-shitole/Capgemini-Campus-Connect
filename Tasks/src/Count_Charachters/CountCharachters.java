package Count_Charachters;

import java.util.*;

public class CountCharachters {

	public static void main(String[] args) {

		char[] arr= {'a','b','a','c','d','a','b','z'};
		
		Source source=new Source();
		
		System.out.println(source.countChar(arr));
		
		
	}

}



class Source{
	
	public Map<Character, Integer> countChar(char[] arr) {
		
		Map<Character, Integer> mp=new HashMap<>();
		ArrayList<Character> list=new ArrayList<>();
		
		for (Character character : arr) {
			list.add(character);
		}
		
		
		for (int i = 0; i < list.size(); i++) {
			
			mp.put(list.get(i), Collections.frequency(list, list.get(i)));
		}
		
		
		return mp;
		
	}
	
}