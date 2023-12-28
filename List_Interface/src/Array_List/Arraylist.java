package Array_List;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>(5);
		al.add(5);
		al.add(3);
		al.add(4);
		al.add(2);
		al.add(2);
		
		ArrayList<String> als=new ArrayList<String>();
		als.add("Hello");
		als.add("Hi");
		als.add("Hey");
		als.add("Namaste");
		als.add("Hola");
		
		
		ArrayList<Integer> al3=new ArrayList<Integer>() {
			{
				add(1);
				add(3);
				add(6);
			}
		};
		
		
		
		//array list can be directly printed 
		System.out.println(al);
		System.out.println(als);
		
		//loop to print Array list
		for(String i: als) {
			System.out.println(i);
		}
		
		System.out.println(al3);
		
		//to check whether ArrayList contains specified data
		System.out.println(al3.contains(3));
		
	}

}
