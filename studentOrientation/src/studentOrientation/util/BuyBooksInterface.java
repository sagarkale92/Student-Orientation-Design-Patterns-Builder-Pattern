package studentOrientation.util;
/**
 * @author Saurabh Chaudhari
 * @author Sagar Kale
 * Interface for buy books options.
 */
public interface BuyBooksInterface {
	public int getUniBookStoreDuration();
	public int getMandoBooksDuration();
	public double getUniBookStoreCost();
	public double getMandoBooksCost();
	public int getUniBookStoreCarbonFootprint();
	public int getMandoBooksCarbonFootprint();
	public int getUniBookStoreEffort();
	public int getMandoBooksEffort();
}
