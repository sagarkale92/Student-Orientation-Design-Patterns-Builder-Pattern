package studentOrientation.util;
/**
 * @author Saurabh Chaudhari
 * @author Sagar Kale
 * Concrete Class for Selection of Campus tour options
 */
public class CampusTour implements CampusTourInterface{
	/**
	 * Enum for Costs association of campus tour options.
	 */
	public enum CampusTourEn{
		BusRide(45, 2.0, 2, 100),
		OnFoot(230, 0.1, 5, 500);
		
		final int duration, carbonFootprint, effort;
		final double cost;
		
		/**
		 * Constructor of Campus tour costs enum
		 * @param durationIn
		 * @param costIn
		 * @param carbonFootprintIn
		 * @param effortIn
		 */
		CampusTourEn(int durationIn, double costIn, int carbonFootprintIn, int effortIn){
			Logger.writeOutput("Constructor of CampusTourEn enum is called.", 3);
			duration = durationIn;
			cost = costIn;
			carbonFootprint = carbonFootprintIn;
			effort = effortIn;
		}
	}
	
	public int getBusRideDuration(){
		return CampusTourEn.BusRide.duration;
	}
	
	public int getOnFootDuration(){
		return CampusTourEn.OnFoot.duration;
	}
	
	public double getBusRideCost(){
		return CampusTourEn.BusRide.cost;
	}
	
	public double getOnFootCost(){
		return CampusTourEn.OnFoot.cost;
	}
	
	public int getBusRideCarbonFootprint(){
		return CampusTourEn.BusRide.carbonFootprint;
	}
	
	public int getOnFootCarbonFootprint(){
		return CampusTourEn.OnFoot.carbonFootprint;
	}
	
	public int getBusRideEffort(){
		return CampusTourEn.BusRide.effort;
	}
	
	public int getOnFootEffort(){
		return CampusTourEn.OnFoot.effort;
	}
}
