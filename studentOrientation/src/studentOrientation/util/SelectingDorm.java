package studentOrientation.util;
/**
 * @author Saurabh Chaudhari
 * @author Sagar Kale
 * Concrete implementation of dorm selection options. 
 */

public class SelectingDorm implements SelectingDormInterface{
	/**
	 * Enum for base price of various dorms.
	 */
	public enum DormBasePrice{
		Dorm1(800),
		Dorm2(1200),
		Dorm3(1500);
		
		final int dormPrice;
		/**
		 * Constructor of dorm price enum.
		 * @param dormPriceIn
		 */
		DormBasePrice(int dormPriceIn){
			dormPrice = dormPriceIn;
		}
		
		public int getDormPrice(){
			return dormPrice;
		}
	}
	/**
	 * Enum for costs associations in various options
	 * for dorm selection.
	 */
	public enum SelectingDormEn{
		LongQueue(50, DormBasePrice.Dorm1.getDormPrice(), 7, 450),
		OnlineGaming(15, (DormBasePrice.Dorm1.getDormPrice()*102)/100, 3, 210);
		
		final int duration, carbonFootprint, effort;
		double cost;
		/**
		 * Constructor of enum of cost associations
		 * for dorm selection.
		 * @param durationIn
		 * @param costIn
		 * @param carbonFootprintIn
		 * @param effortIn
		 */
		SelectingDormEn(int durationIn, int costIn, int carbonFootprintIn, int effortIn){
			Logger.writeOutput("Constructor of SelectingDormEn enum is called.", 3);
			duration = durationIn;
			cost = costIn;
			carbonFootprint = carbonFootprintIn;
			effort = effortIn;
		}
	}
	
	public int getLongQueueDuration(){
		return SelectingDormEn.LongQueue.duration;
	}
	
	public int getOnlineGamingDuration(){
		return SelectingDormEn.OnlineGaming.duration;
	}
	
	public double getLongQueueCost(){
		return SelectingDormEn.LongQueue.cost;
	}
	
	public double getOnlineGamingCost(){
		return SelectingDormEn.OnlineGaming.cost;
	}
	
	public int getLongQueueCarbonFootprint(){
		return SelectingDormEn.LongQueue.carbonFootprint;
	}
	
	public int getOnlineGamingCarbonFootprint(){
		return SelectingDormEn.OnlineGaming.carbonFootprint;
	}
	
	public int getLongQueueEffort(){
		return SelectingDormEn.LongQueue.effort;
	}
	
	public int getOnlineGamingEffort(){
		return SelectingDormEn.OnlineGaming.effort;
	}
}