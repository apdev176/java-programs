package Movie_Ticket_Booking;
import java.util.Scanner;
public class TheatreDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Theatre theatre=new Theatre("INOX");
		
		boolean flag = true;
		while (flag) {
			System.out.println("Press 1-bookticket,"
					+ " 2. checkAvailability" + 
					" 3 show ticket details ,"
					+ " 4 .cancel " + "5.Exit");
			int n = sc.nextInt();
			switch (n) {
			case 1: {
				System.out.println("Enter the movie name");
               String mname=sc.next();
               
				System.out.println("Enter the number of seats");
				int seat=sc.nextInt();
				theatre.setTicket(new Ticket(mname, seat));
			       theatre.bookTicket();
			}
				break;
            //checkAvailability
			case 2: {
                 
				System.out.println("Checking");
				theatre.checkAvailability();
			}
				break;

				//showTicketDetails
			case 3: {
				System.out.println("Ticket details");
				theatre.showTicketDetails();
			}
				break;
			case 4: {
				System.out.println("Cancel");
				System.out.println("Your booking has "+theatre.getTicket().getNo_of_seats()+" bookings");
				System.out.println("Enter number of tickets to cancel");
				int cancel=sc.nextInt();
                 if(cancel<=theatre.getTicket().getNo_of_seats()) {
                     theatre.cancelTicket(cancel);
                 }else {
                	 System.out.println("Could not cancel your bookings");
                 }
			}
				break;
			case 5: {
				System.out.println("Exit session");
				flag = false;
			}
			default: {
				System.out.println("Wrong input");
			}

			}
		}
	}
}
