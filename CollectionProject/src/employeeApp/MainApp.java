package employeeApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		
		ArrayList<Employee> employeesList=new ArrayList<>();
		
		Employee e1= new Employee(1,"aasd",500000f,1);
		Employee e2= new Employee(5,"wef",600300f,3);
		Employee e3= new Employee(2,"gasi",622000f,1);
		Employee e4= new Employee(4,"jas",500000f,2);
		Employee e5= new Employee(3,"sgac",136300f,3);
		Employee e6= new Employee(6,"hqr",643200f,2);
		
		employeesList.add(e1);
		employeesList.add(e2);
		employeesList.add(e3);
		employeesList.add(e4);
		employeesList.add(e5);
		employeesList.add(e6);
		
		
		System.out.println("Id\tName\tSalary\tDepartment ID");
		for (Employee employee : employeesList) {
			System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmployeeSalary()+"\t"+employee.getEmployeeDepId());
		}
		
		System.out.println();
		System.out.println();

		//Sorting objects
		
		//sorting using Employee ID
		System.out.println("Sorting using Employee ID");
		System.out.println();
		
		System.out.println("Id\tName\tSalary\tDepartment ID");

		EmployeeSortId employeeSortId=new EmployeeSortId();
		
		Collections.sort(employeesList,employeeSortId);
		
		for (Employee employee : employeesList) {
			
			System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmployeeSalary()+"\t"+employee.getEmployeeDepId());

		}
		
		
		
		//sorting using Employee Salary
		System.out.println("Sorting using Employee Salary");
		System.out.println();
				
		System.out.println("Id\tName\tSalary\tDepartment ID");

		EmployeeSortSalary employeeSortSalary=new EmployeeSortSalary();
				
		Collections.sort(employeesList,employeeSortSalary);
				
		for (Employee employee : employeesList) {
					
			System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmployeeSalary()+"\t"+employee.getEmployeeDepId());

		}

		
		System.out.println();
		System.out.println();
		

		//sorting using Employee department Id
		System.out.println("Sorting using Employee Department ID");
		System.out.println();
		
		System.out.println("Id\tName\tSalary\tDepartment ID");
		
		EmployeeSortDeptId employeeSortDeptId=new EmployeeSortDeptId();
		
		Collections.sort(employeesList,employeeSortDeptId);
		
		for(Employee employee:employeesList) {
			System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmployeeSalary()+"\t"+employee.getEmployeeDepId());
			
		}
		
		
		System.out.println();
		System.out.println();
		
			
		//sorting using Employee department Name
				System.out.println("Sorting using Employee Name");
				System.out.println();
				
				System.out.println("Id\tName\tSalary\tDepartment ID");
				
				EmployeeSortName employeeSortName=new EmployeeSortName();
				
				Collections.sort(employeesList,employeeSortName);
				
				for(Employee employee:employeesList) {
					System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmployeeSalary()+"\t"+employee.getEmployeeDepId());
					
				}
				
				
				System.out.println();
				System.out.println();
				
				
		//Searching of employee
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name of employee to search");
		String name=scanner.nextLine();
		
		for (Employee employee : employeesList) {
			if(employee.getEmployeeName().equals(name)){
				System.out.println("Employee Found");
				System.out.println("Id\tName\tSalary\tDepartment ID");

				System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmployeeSalary()+"\t"+employee.getEmployeeDepId());

				break;
			}
		}
		
		
		
		
	}

}
