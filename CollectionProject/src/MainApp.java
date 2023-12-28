import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainApp {
	
	public static void main(String args[]) {
		
		ArrayList<Student> studentList=new ArrayList<>();
		
		
		Student s1=new Student(4,"ghi",800.2f);
		Student s2=new Student(3,"mno",804.2f);
		Student s3=new Student(6,"pqr",830.2f);
		Student s4=new Student(1,"jkl",810.2f);
		Student s5=new Student(2,"abc",900.2f);
		Student s6=new Student(5,"def",885.2f);
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
				
		//enhanced for loop
		System.out.println("Using Enhanced for loop");
		System.out.println("Id\tName\tFee");
		for (Student s : studentList) {
			
			
			System.out.println(s.getStudentId()+"\t"+s.getStudentName()+"\t"+s.getStudentFees());
			
		}
		
		System.out.println();
		System.out.println();
		
		//Using iterator
		System.out.println("Using Iterator");
		Iterator<Student> studentIterator=studentList.iterator();
		System.out.println("Id\tName\tFee");

		while(studentIterator.hasNext()) {
			Student student=studentIterator.next();
			
			System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getStudentFees());
		}
		
		
		System.out.println();
		System.out.println();
		
		//Sorting objects using Comparator 
		//1. create comparator implementation class 
		//2. create compare method in it
		//3. create a object in main method
		//4. use Collections.sort(Arraylist, Comparator obj)
		
		System.out.println("Object sorting");
		System.out.println();
		
		System.out.println("Sorting using Id");
		System.out.println("Id\tName\tFee");
		SortStudentId studentSortId= new SortStudentId();
		
		Collections.sort(studentList, studentSortId);
		for (Student s : studentList) {
			
			
			System.out.println(s.getStudentId()+"\t"+s.getStudentName()+"\t"+s.getStudentFees());
		}
		
		

		System.out.println();
		System.out.println();
		
		
		System.out.println("Sorting using Fees");
		System.out.println("Id\tName\tFee");
		SortStudentFees studentSortFees=new SortStudentFees();
		
		Collections.sort(studentList, studentSortFees);
		for (Student s : studentList) {
			System.out.println(s.getStudentId()+"\t"+s.getStudentName()+"\t"+s.getStudentFees());
		}

		System.out.println();
		System.out.println();
		
		
		System.out.println("Sorting using Name");
		System.out.println("Id\tName\tFee");
		SortStudentName studentSortName=new SortStudentName();
		
		Collections.sort(studentList, studentSortName);
		for (Student s : studentList) {
			System.out.println(s.getStudentId()+"\t"+s.getStudentName()+"\t"+s.getStudentFees());
		}
	}

}
