
public class Book extends LibraryItem {
	public String author;
	public Book(int itemNumber, String title, int monthsOverdue, String author) {
		super(itemNumber, title, monthsOverdue);
		this.author = author;
	}

	public String toString() {
		String s = super.toString();
		s += "Author: " + this.author + "\n";
		return s;
	}

}
