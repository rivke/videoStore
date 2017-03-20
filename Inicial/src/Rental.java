/**
 * The rental class represents a customer renting a movie.
 */
public class Rental {

	Movie _movie;
	private int _daysRented;

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}
   public double getAmount() {
		
		return _movie.getAmount(getDaysRented());
		
	}

	public int getFrequentRenterPoints() {
		if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1)
			return 2;
		
			return 1;
	}


}
