import java.util.ArrayList;
import java.util.Iterator;

public class ElatMock {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
	for(int i=1; i<=50;i++) {
		arrayList.add(i);
	}

	System.out.println(arrayList);
	for (Integer integer : arrayList) {
		
		System.out.println(integer);
		
	}
	}

}
