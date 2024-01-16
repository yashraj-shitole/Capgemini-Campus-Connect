import java.io.File;
import java.io.FileOutputStream;


public class File_Handling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File file=new File("Text.txt");
		if (file.exists()) {
			file.createNewFile();
		}
		
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		
		String string1="Yashraj Ranjeet Shitole ";

		fileOutputStream.write(string1.getBytes());

	
		System.out.println("success");
		fileOutputStream.flush();
		fileOutputStream.close();

	}

}
