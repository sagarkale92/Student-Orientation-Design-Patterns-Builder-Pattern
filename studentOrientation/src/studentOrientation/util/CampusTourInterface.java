package studentOrientation.util;
/**
 * @author Saurabh Chaudhari
 * @author Sagar Kale
 * Interface for various Campus tour options.
 */

public interface CampusTourInterface {
	public int getBusRideDuration();
	public int getOnFootDuration();
	public double getBusRideCost();
	public double getOnFootCost();
	public int getBusRideCarbonFootprint();
	public int getOnFootCarbonFootprint();
	public int getBusRideEffort();
	public int getOnFootEffort();
}
