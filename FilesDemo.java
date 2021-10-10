

import java.io.File;
import java.io.IOException;

public class FilesDemo {
public  static  void main(String args[]) {
	try {
		File obj=new File("Murali1.txt");
		if(obj.createNewFile())
		System.out.println("File created sucessfully");
		else 
			System.out.println("File existes");
		}catch (IOException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
	
	}
}
		