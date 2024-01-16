import java.util.function.Predicate;

public class lambdaExpression {

	public static void main(String[] args) {

		//runnable interface
		Runnable r=()->{
			System.out.println("run method called");
		};
		//created a thread to execute Runnable interface r 
		Thread thread1=new Thread(r);
		//starting thread
		thread1.start();
		
		
		
		//Creating thread with interface in it
		Thread thread2=new Thread(()->{System.out.println("hello"); });
		
		
		
	}

}
