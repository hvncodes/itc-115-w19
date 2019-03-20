
public class DVD extends LibraryItem {
	public String studio;
	public int length;
	
	public DVD(int itemNumber, String title, int monthsOverdue, String studio, int length) {
		super(itemNumber, title, monthsOverdue);
		this.studio = studio;
		this.length = length;
	}

	public String toString() {
		String s = super.toString();
		s += "Studio: " + this.studio + "\n";
		s += "Length: " + this.length + " minutes\n";
		return s;
	}

}