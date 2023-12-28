package Array_List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ToRemoveDuplicates {

	
	public static void main(String args[]) {
		
		ArrayList<Integer> al= new ArrayList<>();
		
		al.add(5);
		al.add(2);
		al.add(4);
		al.add(2);
		al.add(2);
		
		System.out.println(al);
		
		//TO remove duplicate not maintaining order
		HashSet<Integer> hSet= new HashSet<>(al);
		System.out.println(hSet);
		
		//TO remove duplicate maintaining order

		LinkedHashSet<Integer> lSet=new LinkedHashSet<>(al);
		System.out.println(lSet);
		
		
	}
}
