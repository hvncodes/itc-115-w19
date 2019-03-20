
public class LibraryItem {
	//fields
	private int itemNumber;
	private String title;
	private int monthsOverdue;
	
	//const
	public LibraryItem(int itemNumber, String title, int monthsOverdue) {
		this.itemNumber = itemNumber;
		this.title = title;
		this.monthsOverdue = monthsOverdue;
	}
	
	
	//methods
	public void reserve() {
		System.out.println("This item is now reserved.");
	}
	
	public void checkIn() {
		System.out.println("This item is now checked in.");
	}
	
	public void checkOut() {
		System.out.println("This item is now checked out.");
	}
	
	public void payFines() {
		if (this.monthsOverdue > 0) {
			System.out.println("Your fine is for " + this.title + " is $" + this.monthsOverdue * 3.0);
		} else { //not overdue
			System.out.println("Your library item, " + this.title + ", is not overdue, there is no fine.");
		}
		System.out.println("----------------");
	}
	
	public String toString() {
		String s = "Item Number: " + this.itemNumber + "\n";
		s += "Title: " + this.title + "\n";
		s += "Months Overdue: " + this.monthsOverdue + "\n";
		return s;
	}
}
