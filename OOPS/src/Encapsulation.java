import java.util.*;

public class Encapsulation {
	
	
	public static void main(String args[]) {
		
		Employee employee=new Employee();
		employee.inputData();
		employee.printData();
		
	}

}


class Employee{
	
	String name;
	int age;
	float salary;
	char gender;
	
	
	void inputData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of employee: ");
		name=sc.nextLine();
		System.out.println("Enter age of employee: ");
		age=sc.nextInt();
		System.out.println("Enter salary of employee: ");
		salary=sc.nextFloat();
		System.err.println("Enter gender of employee: ");
		gender=sc.next().charAt(0);
		
	}
	
	void printData() {
		System.out.println("Name of employee: "+name);
		System.out.println("Age of employee: "+age);
		System.out.println("Salary of employee: "+salary);
		System.out.println("Gender of employee: "+gender);
		
	}
}
