
public class TicketMain {

	public static void main(String[] args) {
		//Ticket t = new Ticket(100); //cannot instantiate an abstract class
		WalkupTicket wt1 = new WalkupTicket(101); //is a relationship (polymorphism)
		
		//get wt1 price
		System.out.println(wt1.getPrice());
		System.out.println(wt1.toString());
		
		Ticket[] t = {new WalkupTicket(102), new AdvanceTicket(103, 15), new AdvanceTicket(104, 7)};
		
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i].getClass() + " " + t[i].toString());
		}
	}

}
