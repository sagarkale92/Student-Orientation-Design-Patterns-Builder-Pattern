package studentOrientation.util;

/**
 * @author Saurabh Chaudhari
 * @author Sagar Kale
 * Concrete class for buy books option.
 */
public class BuyBooks implements BuyBooksInterface{
	/**
	 * Enum for book's price 
	 */
	public enum BookBasePrice{
		Book1(100),
		Book2(200),
		Book3(500);
		
		final int basePrice;
		/**
		 * Constructor for book price enum
		 * @param basePriceIn
		 */
		BookBasePrice(int basePriceIn){
			basePrice = basePriceIn;
		}
		
		public int getBasePrice(){
			return basePrice;
		}
	}
	
	/**
	 * Enum for Costs associatation for buying books options 
	 * from different book stores
	 */
	public enum BuyBooksEn{
		UniBookStore(30, BookBasePrice.Book1.getBasePrice(), 1, 100),
		MandoBooks(110, (BookBasePrice.Book1.getBasePrice()*105)/100, 3, 300);
		
		final int duration, carbonFootprint, effort;
		final double cost;
		/**
		 * Constructor for enum.
		 * @param durationIn
		 * @param costIn
		 * @param carbonFootprintIn
		 * @param effortIn
		 */
		BuyBooksEn(int durationIn, int costIn, int carbonFootprintIn, int effortIn){
			Logger.writeOutput("Constructor of BuyBooksEn enum is called.", 3);
			duration = durationIn;
			cost = costIn;
			carbonFootprint = carbonFootprintIn;
			effort = effortIn;
		}
	}
	
	public int getUniBookStoreDuration(){
		return BuyBooksEn.UniBookStore.duration;
	}
	
	public int getMandoBooksDuration(){
		return BuyBooksEn.MandoBooks.duration;
	}
	
	public double getUniBookStoreCost(){
		return BuyBooksEn.UniBookStore.cost;
	}
	
	public double getMandoBooksCost(){
		return BuyBooksEn.MandoBooks.cost;
	}
	
	public int getUniBookStoreCarbonFootprint(){
		return BuyBooksEn.UniBookStore.carbonFootprint;
	}
	
	public int getMandoBooksCarbonFootprint(){
		return BuyBooksEn.MandoBooks.carbonFootprint;
	}
	
	public int getUniBookStoreEffort(){
		return BuyBooksEn.UniBookStore.effort;
	}
	
	public int getMandoBooksEffort(){
		return BuyBooksEn.MandoBooks.effort;
	}
}
