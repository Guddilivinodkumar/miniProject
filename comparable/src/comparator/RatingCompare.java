package comparator;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		if( o1.getRating()> o2.getRating()) {
	    	return 1;
	    }
		if( o1.getRating()< o2.getRating()) {
	    	return -1;
	    }
		return 0;
	}

}
