
public class AdvanceTicket extends Ticket {
	private int daysInAdvanced;
	
	public AdvanceTicket(int number, int daysInAdvanced) {
		super(number);
		this.daysInAdvanced = daysInAdvanced;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		if (this.daysInAdvanced >= 10) { 
			return 30.0;
		} else {
			return 40.0;
		}
	}

}
