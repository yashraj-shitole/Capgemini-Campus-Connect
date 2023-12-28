import java.util.Scanner;

public class AreaOfShapes {
	


	    public static void main(String[] args) {
	        
	        
	    	int choice=0;
	    	while (choice != 5) {
			System.out.println("*************** CALCULATOR ***************");
			System.out.println("Enter your choice");
			System.out.println("1. Area of Circle");
			System.out.println("2. Area of Square");
			System.out.println("3. Area of Rectangle");
			System.out.println("4. Area of Triangle");
			System.out.println("5: Exit");
			Scanner scanner=new Scanner(System.in);
			choice=scanner.nextInt();
			
			
				
				switch (choice) {
				case 1:{
					AreaOfCircle circle= new AreaOfCircle();
					System.out.println("Enter radius of circle");
					System.out.println("Area of circle is: "+circle.area(scanner.nextFloat()));		
					break;
				}
					
				case 2:{
					  AreaOfSquare square=new AreaOfSquare();
					  System.out.println("Enter length of side of the square");
					  System.out.println("Area of square is: "+square.area(scanner.nextFloat()));
					  break;
					  				
				}
				
				case 3:{
					
					 AreaOfRectangle rectangle=new AreaOfRectangle();
					  System.out.println("Enter length and width of rectangle");
					  System.out.println("Area of rectangle is: "+rectangle.area(scanner.nextFloat(),scanner.nextFloat()));
					
					break;
				}
				case 4:{
					 AreaOfTriangle triangle= new AreaOfTriangle();
					  System.out.println("Enter base and height of triangle");

					 System.out.println("Area of triangle is: "+triangle.area(scanner.nextFloat(), scanner.nextFloat()));
					
					break;
				}
				
				case 5:{
					System.out.println("Exiting...");
					break;
				}
					

				default:
					System.out.println("Wrong option");
					break;
				}
				
				System.out.println();
				
				
		        
		    
		    }

			}
			
				
				
				
			
			
}

	


	class AreaOfCircle{

	    float area(float radius){
	        return 3.14159265359f*radius*radius;
	    }
	}

	class AreaOfSquare{

	    float area(float side){
	        return side*side;
	    }
	}

	class AreaOfRectangle{

	    float area(float length, float width){
	        return length*width;
	    }
	}

	class AreaOfTriangle{

	    float area(float base, float height){
	        return (base*height)/2;
	    }
	}


