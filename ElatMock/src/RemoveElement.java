import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {
		//6. Write a Java program to remove the third element from an array list.
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);


	}

}
