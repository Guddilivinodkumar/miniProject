package comparator;

public class Movie {
       
	private String name;
	private int rating;
	private int year;
	
	public Movie(String name, int rating, int year) {
		this.name=name;
		this.rating=rating;
		this.year=year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	

}
