public class Money {
/*
      2An object of this class represents an amount of money in a particular currency. Amounts can be added and
       subtracted.
       The amount is stored as a quantity of the minor unit of the currency e.g. 1 Rand will be stored as 100 cents.
       */


	// Instance variables
        private Currency currency;
        private long minorUnitAmount;

	// Constructors
        public Money(String amount, Currency currency) {
		this.currency = currency;
		minorUnitAmount = currency.parse(amount);
	}
        
	public Money(long minorUnitAmount, Currency currency) {
		this.minorUnitAmount = minorUnitAmount;
		this.currency = currency;  
	}
        
	// Methods
	public long longAmount() {
		return minorUnitAmount;
	}
       
	public Currency currency() {
		return currency;
	}
        
	public Money add(Money other) {
		long newMinorUnitAmount = longAmount() + other.longAmount();
		return new Money(newMinorUnitAmount, currency);	
	}
	
	public Money subtract(Money other) {
		long newMinorUnitAmount = longAmount() - other.longAmount();
		return new Money(newMinorUnitAmount, currency);	
	}
	
	public String toString() {
	       return currency.symbol() + currency.format(longAmount());
	}
	
}
