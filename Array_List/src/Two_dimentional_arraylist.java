import java.util.ArrayList;
import java.util.Iterator;

public class Two_dimentional_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<ArrayList<ArrayList<Integer>>> mainList=new ArrayList<>();
		
		
		
		
		ArrayList<Integer> subList1=new ArrayList<>();
		subList1.add(1);
		subList1.add(2);
		subList1.add(3);
		
		ArrayList<Integer> subList2=new ArrayList<>();
		subList2.add(4);
		subList2.add(5);
		subList2.add(6);
		
		ArrayList<Integer> subList3=new ArrayList<>();
		subList3.add(7);
		subList3.add(8);
		subList3.add(9);
		
		ArrayList<Integer> subList4=new ArrayList<>();
		subList4.add(10);
		subList4.add(11);
		subList4.add(12);
		
		
		
		ArrayList<ArrayList<Integer>> list1=new ArrayList<>();
		list1.add(subList1);
		list1.add(subList2);
		
		
		ArrayList<ArrayList<Integer>> list2=new ArrayList<>();
		list2.add(subList3);
		list2.add(subList4);
		
		
		mainList.add(list1);
		mainList.add(list2);
		
		
		for (ArrayList<ArrayList<Integer>> arrayList : mainList) {
			for (ArrayList<Integer> a:arrayList) 
			{
				for (Integer b:a) 
				{
					System.out.println(b);
					}
				}
		}
		
		
		

	}

}
