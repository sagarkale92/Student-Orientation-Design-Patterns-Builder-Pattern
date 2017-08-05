package studentOrientation.util;

/**
 * @author Saurabh Chaudhari
 * @author Sagar Kale
 * Interface for Orientation.
 */

public interface Orientation {
	public int getDuration();
	void setDuration(int duration);
	public double getCost();
	public void setCost(double cost);
	public int getCarbonFootprint();
	public void setCarbonFootprint(int carbonFootprint);
	public int getEfforts();
	public void setEfforts(int efforts);
}
