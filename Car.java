import java.text.NumberFormat;
import java.util.Locale;

public class Fruit extends Product {
	//FIELDS
	private String color;
    
    //CONSTRUCTOR
    public Fruit(String name, int code, String description, double price, int count, String color) {
		if (name == null || code == null || description == null || price == null || count == null || color == null) {
			throw new NullPointerException();
        }
		this.name = name;
		this.code = code;
		this.description = description;
		this.price = price;
		this.count = count;
        this.color = color;
	}
	
	@Override
	public String getPriceFormatted() {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
        return formattedPrice;
	}
	
	@Override
	public void toString() {
		System.out.println(this.color);
        System.out.println(this.name);
        System.out.println(this.code);
        System.out.println(this.description);
        System.out.println(this.price);
        System.out.println(this.count);
        System.out.println(this.color);
	}
	
}
