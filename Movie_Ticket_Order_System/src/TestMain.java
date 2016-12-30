
public class TestMain {

	public static void main(String[] args) {
	Movie WOW =new Movie("魔兽世界-起源");
	WOW.setMoviePrice(80);
	WOW.setMovieDateReleased("2016.07.01");
	WOW.setMovieSeats(120);
	WOW.setMovieTime("07:35 PM");
	WOW.movieTicketBought();
	WOW.setMovieSeats(2);
	WOW.movieTicketBought();
	WOW.movieTicketBought();
	}

}
