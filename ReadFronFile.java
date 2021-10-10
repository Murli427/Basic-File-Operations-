import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFronFile {
	public static void main(String args[]) {
		try {
			File obj =new File("Murali.txt");
			Scanner s=new Scanner(obj);
			while(s.hasNextLine()) {
			String data=s.nextLine();
			System.out.println(data+"\n");
			}
			s.close();
			}catch(FileNotFoundException e) {
				System.out.println("error");
				e.printStackTrace();
			}
	   File Op=new File("Murali.txt");
	   if(Op.exists()) {
		   System.out.println(Op.getName());
		   System.out.println(Op.canRead());
		   System.out.println(Op.canWrite());
		   System.out.println(Op.getAbsolutePath());
		   System.out.println(Op.length());
		   System.out.println("\n ");
	   }
	   
	   File del=new File("Murali.txt");
	   if(del.delete())
		   System.out.println("Deleted successfully "+del.getName());
	   else 
		   System.out.println("Failed to delete");
		   
	}

}
