
public class InAmsterdam {

	public static Integer amCount(String string) {
		
		int count=0;
		string=string.toLowerCase();
		
		if (string != null) {
			 for (int i = 0; i < string.length()-1; i++) {
				if (string.charAt(i)=='a' && string.charAt(i+1)=='m') {
					count++;
				}
			}
		}
		else {
			return null;
		}
		
		return count;
		
	}
	public static void main(String[] args) {
		
		System.out.println(amCount("InAmsterdam"));

	}

}
