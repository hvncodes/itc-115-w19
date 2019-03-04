//REPRESENTS A GENERIC PRODUCT

public abstract class Product {
	//FIELDS
	private String name;
	private int code;
	private String description;
	private double value;
	private int count;
	
	//METHODS
	public abstract String getPriceFormatted();
}
