//REPRESENTS A GENERIC PRODUCT
// #############################  GETTERS AND SETTERS  #############################
public abstract class Product {
	//FIELDS
	private String name;
	private int code;
	private String description;
	private double price;
	private int count;
	
	//METHODS
	public abstract String getPriceFormatted();
	public abstract void toString();
}
