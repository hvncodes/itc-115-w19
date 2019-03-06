import java.text.NumberFormat;
import java.util.Locale;

public class Fruit extends Product {
	//FIELDS
	private String symbol;
	double price;
	
	@Override
	public String getPriceFormatted() {
        	String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
        	return formattedPrice;
	}
	
	@Override
	public void toString() {
		//spit out data
	}
	
}
