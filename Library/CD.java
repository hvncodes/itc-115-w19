
public class CD extends LibraryItem {
	public String artist;
	public int numTracks;
	
	public CD(int itemNumber, String title, int monthsOverdue, String artist, int numTracks) {
		super(itemNumber, title, monthsOverdue);
		this.artist = artist;
		this.numTracks = numTracks;
	}

	public String toString() {
		String s = super.toString();
		s += "Artist: " + this.artist + "\n";
		s += "Number of Tracks: " + this.numTracks + "\n";
		return s;
	}

}