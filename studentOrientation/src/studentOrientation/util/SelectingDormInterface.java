package studentOrientation.util;
/**
 * @author Saurabh Chaudhari
 * @author Sagar Kale
 * Interface for dorm selection option.
 */

public interface SelectingDormInterface {
	public int getLongQueueDuration();
	public int getOnlineGamingDuration();
	public double getLongQueueCost();
	public double getOnlineGamingCost();
	public int getLongQueueCarbonFootprint();
	public int getOnlineGamingCarbonFootprint();
	public int getLongQueueEffort();
	public int getOnlineGamingEffort();
}
