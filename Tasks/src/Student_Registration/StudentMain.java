package Student_Registration;

public class StudentMain {

	public static void main(String[] args) {
		Student s1=new Student("Yashraj", 21);
		Clasroom cm=new Clasroom();
		String reString=cm.registerStudent(s1);
		System.out.println(reString);
		String reString1=cm.studentCard("70");
		System.out.println(reString1);
	}

}
class Student 
{
	String name;
	int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
}

class Clasroom
{
	String registerStudent(Student student)
	{
		int flag=0;
		for(int i=0;i<student.name.length();i++)
		{
			if(Character.isLowerCase(student.name.charAt(i)))
			{
				
				flag++;
			}
		}
		if(flag!=0)
		{
			return "Block letters needed";
		}
		else if(student.score>100 || student.score<0)
		{
			return "Invalid Score";
		}
		else {
			return "Registered";
		}
	}

	
	String studentCard(String card)
	{  
		boolean flag;
		try {
			Integer.parseInt(card);
			flag= true;
		}
		catch (NumberFormatException e) {
			flag= false;
		}
		
		if(flag)
		{
			return"Valid card";
		}
		else {
			return "Invalid Card";
		}
	}
}