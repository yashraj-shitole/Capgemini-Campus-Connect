package employeeApp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Employee {
//	Employee ->class
//	employeeId
//	employeeName
//	employeeSalary
//	employeeDeptId
//
//	sort based on id
//	based salary
//	based deptId
	
	private int employeeId;
	private String employeeName;
	private float employeeSalary;
	private int employeeDepId;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, float emplyeeSalary, int employeeDepId) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = emplyeeSalary;
		this.employeeDepId = employeeDepId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public float getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(float emplyeeSalary) {
		this.employeeSalary = emplyeeSalary;
	}

	public int getEmployeeDepId() {
		return employeeDepId;
	}

	public void setEmployeeDepId(int employeeDepId) {
		this.employeeDepId = employeeDepId;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", emplyeeSalary="
				+ employeeSalary + ", employeeDepId=" + employeeDepId + "]";
	}
	

}



class EmployeeSortId implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.getEmployeeId()>e2.getEmployeeId()) {
			return 1;
		}
		else if (e1.getEmployeeId()<e2.getEmployeeId()) {
			return -1;
		}
		else {
			return 0;
		}
		
	}
	
}


class EmployeeSortSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.getEmployeeSalary()>e2.getEmployeeSalary()) {
			return 1;
		}
		else if (e1.getEmployeeSalary()<e2.getEmployeeSalary()) {
			return -1;
		}
		else {
			return 0;
		}
		
	}
	
}

class EmployeeSortDeptId implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		if(e1.getEmployeeDepId()>e2.getEmployeeDepId())
			return 1;
		else if(e1.getEmployeeDepId()<e2.getEmployeeDepId())
			return -1;
		else 
			return 0;
		
	}
	
}

class EmployeeSortName implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getEmployeeName().compareToIgnoreCase(e2.getEmployeeName());
		
	}
	
	
	
}


