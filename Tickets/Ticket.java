//super class for all tickets
public abstract class Ticket {
	//FIELDS
	private int number;
	
	//CONSTRUCTORS
	public Ticket(int number) {
		//set the value of the field to the argument passed to the constructor
		this.number = number;
	}
	
	//abstract methods do not need implemtations
	//therefore, the subclass is required to implement it
	public abstract double getPrice();
	
	public String toString() {
		return "Number: " + this.number + ", Price: " + this.getPrice();
	}
}
