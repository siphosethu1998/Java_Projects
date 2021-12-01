public class Currency {

 	// Instance variables
	private String symbol;
	private String code;
	private int minorPerMajor;

	// Constructors
	public Currency(String symbol, String code, int minorPerMajor) {
		this.symbol = symbol;
		this.code = code;
		this.minorPerMajor = minorPerMajor;
	}
	
	// Methods
	public String symbol() {
		return symbol;
	}
	
	public String code() {
		return code;
	}
	
	public int minorPerMajor() { 
		return minorPerMajor;
	}

	public String format(long amount) {
		return (double)amount / minorPerMajor + "";
	}
	
	public long parse(String amount) {
		return (int)(Double.parseDouble(amount)*minorPerMajor);
	}
}
