package comparator;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>();
		 list.add(new Movie("john",8,1986));
		 list.add(new Movie("pirates",6,1996));
		 list.add(new Movie("carebian",10,2008));
		 list.add(new Movie("furious",4,1956));
		 
		 RatingCompare rt= new RatingCompare();
		  Collections.sort(list,rt);
		 for(Movie movie:list) {
			 System.out.print(movie.getName()+" ");
			 System.out.print(movie.getRating()+" ");
			 System.out.print(movie.getYear()+" ");
			 System.out.println();
		 }
		 System.out.println("-----------------------");
		 NameComparator nc= new NameComparator();
		 Collections.sort(list,nc);
		 for(Movie movie:list) {
			 System.out.print(movie.getName()+" ");
			 System.out.print(movie.getRating()+" ");
			 System.out.print(movie.getYear()+" ");
			 System.out.println();
		 }
	}

}
