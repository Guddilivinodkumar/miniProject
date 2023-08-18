package llist;
import java.util.stream.Stream;

public class demolab {
	    public static void main(String[] args) {
	        Stream stream=Stream.of("A","B","C","D");
	  System.out.println(stream.peek(System.out::print)
			  .findAny().orElse("NA")); 
	    }
	}


