
public class OddEvenUsingSwitch {

	
	public static void main(String args[]) {
	
	int num=1;
	
	switch (num%2) {
	case 0: {
		System.out.println("Even number");
		break;
	}
	default:
		System.out.println("Odd number");
	}
}
}
