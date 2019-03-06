import java.text.NumberFormat;
//import java.util.Locale;

public class Fruit extends Product {
	//FIELDS
	private String color;
    
    //CONSTRUCTOR
    public Fruit(String name, int code, String description, double price, int count, String color) {
		super(name, code, description, price, count);
        this.color = color;
	}
	
	@Override
	public String getPriceFormatted() {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(super.getPrice());
        return formattedPrice;
	}
	
	@Override
	public String toString() {
		String s = "Product: " + this.color + " " + super.getName() + "\n";
		s += "Product Code: " + super.getCode() + "\n";
		s += "Description: " + super.getDescription() + "\n";
		s += "Price: " + this.getPriceFormatted() + "\n";
		s += "Count: " + super.getCount() + "\n";
		return s;
	}
	
}
