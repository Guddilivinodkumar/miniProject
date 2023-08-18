import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class A {
public static void main(String[] args) {
	File f=new File("C:\\Users\\vinod\\Downloads\\java_Eclipse\\text1.txt");
	try {
		FileReader fr = new FileReader(f);
		for (int i = 0; i < f.length(); i++) {
			System.out.print((char)fr.read());
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	
 }
}


