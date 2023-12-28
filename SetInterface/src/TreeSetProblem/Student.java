package TreeSetProblem;

import java.util.Comparator;


class Student {

	private int studentId;
	private String studentName;
	private float studentFees;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, float studentFees) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public float getStudentFees() {
		return studentFees;
	}
	public void setStudentFees(float studentFees) {
		this.studentFees = studentFees;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ "]";
	}
	
	
}


class SortById implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getStudentId() > s2.getStudentId() ) {
            return 1;
        }
        else if ( s1.getStudentId() < s2.getStudentId()) {
            return -1;
        }
        else {
            return 0;
        }
	}
	
}


class SortByFee implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		if (s1.getStudentFees()> s2.getStudentFees()) {
			return 1;
			
		}
		if (s1.getStudentFees()< s2.getStudentFees()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}

class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student e1,Student e2) {
		return e1.getStudentName().compareToIgnoreCase(e2.getStudentName());
		
	}
	
	
	
	
}
