
import java.util.*;
public class Gradecalculator {
	
	

   

    public static void main(String[] args) {
    
    	
    	Grade s1=new Grade();
        s1.takeInput();
        s1.displayOutput();
        
        Grade s2=new Grade();
        s2.takeInput();
        s2.displayOutput();
    }

}


class Grade{
	int marks;
	
	
	 public void takeInput() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter your marks: ");
	        marks = scanner.nextInt();
	       
	    }

	  

	    public void displayOutput() {
	    	String grade;
	    	  if (marks >= 80 && marks <= 100) {
		            grade = "A";
		        } else if (marks >= 60 && marks <= 79) {
		            grade = "B";
		        } else if (marks >= 40 && marks <= 59) {
		            grade = "C";
		        } else if (marks >= 0 && marks <= 39) {
		            grade = "Fail";
		        } else {
		            grade = "Invalid input";
		        }
	    	  
	        System.out.println("Your grade is: " + grade);
	    }
}
