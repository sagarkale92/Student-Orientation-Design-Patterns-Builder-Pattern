package studentOrientation.util;
/**
 * @author Saurabh Chaudhari
 * @author Sagar Kale
 * Concrete Implementation of Orientation.
 * Contains the costs selected options.
 */

public class StudentOrientation implements Orientation{
	private CostInterface cost;
	private EffortInterface effort;
	private CarbonFootPrintInterface carbonFootprint;
	private DurationInterface duration;
	@Override
	public int getDuration() {
		return duration.getDuration();
	}
	/**
	 * Constructor of StudentOrientation
	 * To initialize the objects to concrete class.
	 */
	public StudentOrientation() {
		cost = new Cost();
		effort = new Effort();
		carbonFootprint = new CarbonFootPrint();
		duration = new Duration();
	}
	@Override
	public void setDuration(int durationIn) {
		duration.setValue(durationIn);
	}
	@Override
	public double getCost() {
		return cost.getCostValue();
	}
	@Override
	public void setCost(double costIn) {
		cost.setValue(costIn);
	}
	@Override
	public int getCarbonFootprint() {
		return carbonFootprint.getCarbonFootPrintValue();
	}
	@Override
	public void setCarbonFootprint(int carbonFootprintIn) {
		carbonFootprint.setValue(carbonFootprintIn);
	}
	@Override
	public int getEfforts() {
		return effort.getEffortValue();
	}
	@Override
	public void setEfforts(int effortsIn) {
		effort.setValue(effortsIn);
	}
	
	

}