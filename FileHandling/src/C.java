import java.io.FileWriter;
import java.io.IOException;

public class C {
public static void main(String[] args) {
	try {
		FileWriter fr=new FileWriter("C:\\Users\\vinod\\Downloads\\java_Eclipse\\text1.txt");
		fr.write("pankaj sir academy");
		fr.close();
	} catch (IOException e) {
		e.printStackTrace();
	} 

}
}
