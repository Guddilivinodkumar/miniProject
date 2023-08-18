import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class E {
public static void main(String[] args) {
	try {
	FileWriter f= new FileWriter("C:\\Users\\vinod\\Downloads\\java_Eclipse\\text1.txt");
	BufferedWriter br= new BufferedWriter(f);
		br.write("hello");
		br.newLine();
		br.write("welcome");
		br.close();
		f.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	
}
}
