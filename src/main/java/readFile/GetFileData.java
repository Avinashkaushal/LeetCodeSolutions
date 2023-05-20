package readFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetFileData {

	public static void main(String[] args) throws FileNotFoundException {
		 File file = new File("C:\\Users\\avinash.kaushal\\file.txt");
		 
		 Scanner sc = new Scanner(file);
		 
		 String data = sc.nextLine();
		 
		 System.out.println(data);
		 
		 data.replaceAll("a", "$");

		 System.out.println(data);
	}

}
