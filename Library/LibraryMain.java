
public class LibraryMain {

	public static void main(String[] args) {
		LibraryItem[] items = {
			new Book(9857498,"Greatest Book of All Time", 0,"Bob"), 
			new Magazine(645173, "Heroes of Science", 1, "Discover", "March"),
			new DVD(11136, "Shrek", 6, "DreamWorks", 90),
			new CD(91146468, "Scorpion", 0, "Drake", 25)
		};
		
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i].toString());
			items[i].payFines();
		}
	}

}
