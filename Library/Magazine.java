
public class Magazine extends LibraryItem {
	public String masthead;
	public String issue;
	
	public Magazine(int itemNumber, String title, int monthsOverdue, String masthead, String issue) {
		super(itemNumber, title, monthsOverdue);
		this.masthead = masthead;
		this.issue = issue;
	}

	public String toString() {
		String s = super.toString();
		s += "Masthead: " + this.masthead + "\n";
		s += "Issue: " + this.issue + "\n";
		return s;
	}

}