import java.util.Comparator;

public class Student {

	private int studentId;
	private String studentName;
	private float studentFees;
	
	
	
	//constructor with no argument
	public Student() {
		super();
	}


	//constructor with argument
	public Student(int studentId, String studentName, float studentFees) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
	}
	

	//setter and getter methods
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

	//toString method
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ "]";
	}
	
	
}

class SortStudentId implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getStudentId()>s2.getStudentId()) {
			return 1;
		}
		
		else if (s1.getStudentId()<s2.getStudentId()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}



class SortStudentFees implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getStudentFees()>s2.getStudentFees()) {
			return 1;
		}
		
		else if (s1.getStudentFees()<s2.getStudentFees()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}


class SortStudentName implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getStudentName().compareToIgnoreCase(s2.getStudentName());
	}
	
}
