import java.text.NumberFormat;

public class Car extends Product {
	//FIELDS
	private String color;
	private String make;
	private String model;
	private int year;
    
    //CONSTRUCTOR
    public Car(String name, int code, String description, double price, int count, String color, String make, String model, int year) {
		super(name, code, description, price, count);
        this.color = color;
        this.make = make;
        this.model = model;
        this.year = year;
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
		s += "Make/Model/Year: " + this.make + "/" + this.model + "/" + this.year + "/" + "\n";
		return s;
	}
	
}
