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
		if (name == null || description == null) {
			throw new NullPointerException();
        }
		this.name = name;
		this.code = code;
		this.description = description;
		this.price = price;
		this.count = count;
	}
	
	//GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	//METHODS
	public abstract String getPriceFormatted();
	public abstract String toString();
}
