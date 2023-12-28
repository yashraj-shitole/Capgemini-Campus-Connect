package Linked_List;
import java.util.LinkedList;

public class Linked_List {
	
	
	public static void main(String[] args) {
		
		
		LinkedList<Integer> ll=new LinkedList<>();
		
		
		//to add a element at end
		ll.add(15);
		
		ll.add(10);
		ll.add(12);
		ll.add(17);
		ll.add(83);
		
		//to add at specific index
		ll.add(4,16); // .add(index, data)
		
		//to add at first
		ll.addFirst(91);
		
		//to add at last
		ll.addLast(66);
		
		//to get element at index
		// getFirst() getLast()
		 System.out.println(ll.get(3));
		 
		//to get index of element
		 System.out.println(ll.indexOf(12));
		 
		//to replace element
		 ll.set(2, 99); // .set(index, data);
	
		
		
		System.out.println(ll);
		
		//to check element is present
		System.out.println(ll.contains(15));
		
		
		//delete all elements
		ll.clear();
		System.out.println(ll);
		
	}
}
