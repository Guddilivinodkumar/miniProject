import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class B {
public static void main(String[] args) throws FileNotFoundException {
	try {
	File f=new File("C:\\Users\\vinod\\Downloads\\java_Eclipse\\text1.txt");
	FileReader fr = new FileReader(f);
	char [] ch= new char[(int) f.length()];
		fr.read(ch);
		for (char c : ch) {
			System.out.print(c);
			fr.close();
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
}
}
