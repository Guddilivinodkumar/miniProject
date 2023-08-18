import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D {
public static void main(String[] args) {
	FileReader fr;
	try {
		fr = new FileReader("C:\\Users\\vinod\\Downloads\\java_Eclipse\\text1.txt");
	BufferedReader br=new BufferedReader(fr);
		System.out.println(br.readLine());
		char [] ch= new char[40];
		br.read(ch);
		for (char c : ch) {
			System.out.print(c);
			}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
