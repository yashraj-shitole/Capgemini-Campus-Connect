
import java.util.*;
public class ElectricityBillCalculator {
	
	
	
	public static void main(String args[]) {
		
		
		Customer customer=new Customer();
		
		customer.dataInput();
		customer.billCalculate();
		customer.displayBill();
		
				
	}

}

class Customer{
	
	String custName;
	int unit;
	double bill;
	Scanner scanner=new Scanner(System.in);

	
	void dataInput() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter customer name: ");
		custName=scanner.nextLine();
		System.out.print("Enter units consumed: ");
		unit=scanner.nextInt();
	}
	
	void billCalculate(){
		
		if(unit>0 && unit<=100){
			
			bill=2*unit;
			
		}
		else if(unit>100 && unit<=200) {
			bill=(100*2)+(3*(unit-100));
		}
		else if (unit>200 && unit<=300) {
			bill=(100*2)+(3*100)+(5*(unit-200));	
		}
		else if(unit>300){
			
			bill=(100*2)+(3*100)+(5*100)+(((unit-300)*2.5)/100);
		}
			
	}
	
	void displayBill() {
		System.out.println("Name of Customer: "+custName);
		System.out.println("Units consumed by customer: "+unit);
		System.out.println("Bill amount: "+bill);
	}
	
	
}
