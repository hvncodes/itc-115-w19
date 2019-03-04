
public class Stock {
	//FIELDS
	private String symbol;
	private int totalShares;
	private double totalCost;
	
	//CONSTRUCTORS
	//PRE: symbol != null
	public Stock(String theSymbol) {
		if(theSymbol == null) {
			throw new NullPointerException();
		}
		this.symbol = theSymbol;
		this.totalShares = 0;
		this.totalCost = 0.0;
	}
	
	//METHODS
	//return the total profit or less eartn on the stock based on the given price per share
	//PRE: price >= 0
	public double getProfit(double currentPrice) {
		if (currentPrice < 0.0) {
			throw new IllegalArgumentException();
		}
		double marketValue = currentPrice * this.totalShares;
		return marketValue - this.totalCost;
	}
	
	//record a purchse of a share at a given price
	//PRE: shares >= 0 && pricePerShare >= 0.0
	public void purchase(int shares, double pricePerShare) {
		if(shares < 0 || pricePerShare < 0.0) {
			throw new IllegalArgumentException();
		}
		this.totalShares += shares;
		this.totalCost += shares * pricePerShare;
	}
}
