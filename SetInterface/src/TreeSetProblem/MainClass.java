package TreeSetProblem;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Student> sTreeSet=new TreeSet<Student>(new SortById());
		
		Student s1=new Student(1,"ghi",800.2f);
		Student s2=new Student(2,"mno",804.2f);
		Student s3=new Student(3,"pqr",830.2f);
		Student s4=new Student(4,"jkl",810.2f);
		Student s5=new Student(5,"abc",900.2f);
		Student s6=new Student(6,"def",885.2f);
		
		sTreeSet.add(s1);
		sTreeSet.add(s2);
		sTreeSet.add(s3);
		sTreeSet.add(s4);
		sTreeSet.add(s5);
		sTreeSet.add(s6);

			
		
		System.out.println(sTreeSet);
		
		System.out.println();
		System.out.println();
		System.out.println("Id\tName\tFee");

		for (Student s : sTreeSet) {
			
			
			System.out.println(s.getStudentId()+"\t"+s.getStudentName()+"\t"+s.getStudentFees());
			
		}
		
		
		Set<Student> sortByFee=new TreeSet<Student>(new SortByFee());

		sortByFee.add(s1);
		sortByFee.add(s2);
		sortByFee.add(s3);
		sortByFee.add(s4);
		sortByFee.add(s5);
		sortByFee.add(s6);
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("Id\tName\tFee");

		for (Student s : sortByFee) {
				
			System.out.println(s.getStudentId()+"\t"+s.getStudentName()+"\t"+s.getStudentFees());
			
		}
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("Id\tName\tFee");
		
		Set<Student> sortByNameSet=new TreeSet<>(new SortByName());
		
		sortByNameSet.add(s1);
		sortByNameSet.add(s2);
		sortByNameSet.add(s3);
		sortByNameSet.add(s4);
		sortByNameSet.add(s5);
		sortByNameSet.add(s6);
		
		
		for (Student s : sortByNameSet) {
			System.out.println(s.getStudentId()+"\t"+s.getStudentName()+"\t"+s.getStudentFees());
		}
		
		
	}

}
