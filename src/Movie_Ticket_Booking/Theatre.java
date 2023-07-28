package Movie_Ticket_Booking;

public class Theatre {
private  String theatre_name;
	
	static int no_of_seats=500;
	private Ticket ticket;
	public Theatre() 
	{
		// TODO Auto-generated constructor stub
	}
	public Theatre(String theatre_name) {
		this.theatre_name=theatre_name;
	}
	public String getTheatre_name() {
		return theatre_name;
	}
	public void setTheatre_name(String theatre_name) {
		this.theatre_name = theatre_name;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	//methods 
	public void bookTicket() {
		System.out.println("Booking in progress");
		if(ticket.getNo_of_seats()<=Theatre.no_of_seats) {
		int remaining=Theatre.no_of_seats-ticket.getNo_of_seats();
	    Theatre.no_of_seats=remaining;
	    System.out.println("Your Ticket has been booked");
		}else {
			System.out.println("Not Booked due to technical issue");
		}
		System.out.println(no_of_seats+" left for booking");
		}
		//cancelticket
	public void cancelTicket(int n) {
		System.out.println("Cancelling in progress");
		int remaining=Theatre.no_of_seats+n;

		Theatre.no_of_seats=remaining;
		System.out.println("Cancelled");
		System.out.println(no_of_seats+" left for booking");
	}

	//showTicketDetails
	public void showTicketDetails(){
		System.out.println("Theater name is "+theatre_name);
		System.out.println("Movie name is "+ticket.getMovie_name());
		System.out.println("Tickets book are: "+ticket.getNo_of_seats());
		System.out.println("Total available Seats are "+no_of_seats);
	}

	//checkAvailability
	public void checkAvailability(){
		if(ticket.getNo_of_seats()>0){
			System.out.println("Total Available Seats are: "+no_of_seats);
		}
	}
}
