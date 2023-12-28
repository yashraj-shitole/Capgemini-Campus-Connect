import java.util.Iterator;
import java.util.Scanner;

public class FactorsOfNumer {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Get the factors of the number
        System.out.println("The factors of " + number + " are: ");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
	

}
