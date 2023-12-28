
	//Methods of Thread Class
	class MyClass extends Thread{
		@Override
		public void run() {
			System.out.println("Inside a run Method");
			System.out.println("Child Thread is "+Thread.currentThread());
		}
		
	}
	public class ThreadMethods {

		public static void main(String[] args) {
			System.out.println("Main Thread "+Thread.currentThread());
			MyClass ob=new MyClass();
			MyClass ob1=new MyClass();
			ob.setName("FirstName");
			ob1.setName("SecondName");
			ob.start();
			System.out.println("ob Status"+ob.isAlive());
			ob1.start();
			System.out.println("ob status"+ob1.isAlive());
		
		}

	}


