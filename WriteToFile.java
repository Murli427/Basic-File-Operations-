import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String args[]) {
		try {
			int n=1;
			FileWriter obj=new FileWriter("Murali.txt");
			FileWriter obj1=new FileWriter("Mur.txt");
			obj.write("My first file write ");
			while (n!=5) {
			obj1.write("My"+ n +" first file write "+"\n");
			n++;
			}
		   System.out.println("Write succesfully");
		   obj.close();
		   obj1.close();
			
			
		}catch(IOException e) {
			System.out.println("error");
			e.printStackTrace();
			
			
		}
		
	}

}
