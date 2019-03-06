//REPRESENTS A GENERIC PRODUCT

public abstract class Product {
	//FIELDS
	private String name;
	private int code;
	private String description;
	private double price;
	private int count;
	
	//CONSTRUCTOR
	public Product(String name, int code, String description, double price, int count) {
		if (name == null || code == null || description == null || value == null || count == null) {
			throw new NullPointerException();
        	}
		this.name = name;
		this.code = code;
		this.description = description;
		this.value = price;
		this.count = count;
	}
	
	//METHODS
	public abstract String getPriceFormatted();
	public abstract void toString();
}
