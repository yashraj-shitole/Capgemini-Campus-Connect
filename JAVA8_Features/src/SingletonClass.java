import java.sql.DatabaseMetaData;

public class SingletonClass {

	public static void main(String[] args) {
		
		Singleton si=Singleton.getObj();
		
		si.getData();

	}

}


class Singleton{
	
	private static Singleton singleton;
	
	private Singleton() {
		
	}
	
	public static Singleton getObj() {
		if (singleton==null) {
			singleton =new Singleton();
		}
		
		return singleton;
	}
	
	public void getData() {
		System.out.println("Singleton obj caled");
	}
}
