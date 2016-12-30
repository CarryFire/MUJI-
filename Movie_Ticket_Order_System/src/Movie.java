public class Movie {
	static int Movie_Num = 0;
	String Movie_Name;
	String Movie_Date_Released;
	String Movie_Date_Out;
	Double Price_Of_Movie;
	int Seats_Of_Movie;
	int Seats_Remained;
	String Movie_Time;
	Movie() {
		this.Movie_Name = "Null";
		this.Price_Of_Movie = 50.0;
		Movie_Num++;
	}

	Movie(String Name) {
		this.Movie_Name = Name;
		this.Price_Of_Movie = 50.0;
		Movie_Num++;
	}

	void setMoviePrice(double price) {
		this.Price_Of_Movie = price;
	}

	void setMovieDateReleased(String date) {
		this.Movie_Date_Released = date;
	}

	void setMovieDateOut(String date) {
		this.Movie_Date_Out = date;
	}

	void setMovieName(String name) {
		this.Movie_Name = name;
	}

	String getMovieName() {
		return this.Movie_Name;
	}

	String getMovieDateReleased() {
		return this.Movie_Date_Released;
	}

	String getMovieDateOut() {
		return this.Movie_Date_Out;
	}

	Double getMoviePrice() {
		return this.Price_Of_Movie;
	}

	int getMovieNum() {
		return Movie_Num;
	}
	void setMovieSeats(int seat) {
		int Seat_Minus = this.Seats_Of_Movie - this.Seats_Remained;
		this.Seats_Of_Movie = seat;
		this.Seats_Remained = seat - Seat_Minus;
	}

	void setMovieTime(String time) {
		this.Movie_Time = time;
	}

	int getMovieSeat() {
		return this.Seats_Of_Movie;
	}

	int getMovieSeatRemained() {
		return this.Seats_Remained;
	}

	String getMovieTime() {
		return this.Movie_Time;
	}
	
	void movieTicketBought()
	{
		if(this.Seats_Remained>0)
		{
			Ticket ticket =new Ticket(this.Movie_Name,this.Movie_Time,this.Seats_Of_Movie-this.Seats_Remained,this.Movie_Date_Released);
			this.Seats_Remained--;
			System.out.println("Ticket Code:  "+ticket.getTicketCode());
			System.out.println("Movie:  "+ticket.getTicketMovieName());
			System.out.println("Date :  "+ticket.getTicketMovieDate());
			System.out.println("Time :  "  +ticket.getTicketMovieTime());
			System.out.println("Seats:  S"+ticket.getSeatNum());
		}
		else System.out.println("Sold Out!");
	}
}

