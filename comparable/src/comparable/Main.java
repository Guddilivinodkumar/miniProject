package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Main {
	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>();
		 list.add(new Movie("john",8,1986));
		 list.add(new Movie("pirates",6,1996));
		 list.add(new Movie("carebian",10,2008));
		 list.add(new Movie("furious",4,1956));
		 Collections.sort(list);
		 
//		 Iterator<Movie> itr = list.iterator();
//		 while(itr.hasNext()) {
//			 System.out.print(itr.next().getName());
//			 System.out.print(itr.next().getRating());
//			 System.out.print(itr.next().getYear());
//			 System.out.println();
//		 }
		 
		 for(Movie movie:list) {
			 System.out.print(movie.getName()+" ");
			 System.out.print(movie.getRating()+" ");
			 System.out.print(movie.getYear()+" ");
			 System.out.println();
		 }

	}

}
