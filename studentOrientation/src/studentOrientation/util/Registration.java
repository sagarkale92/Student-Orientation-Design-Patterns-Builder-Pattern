package studentOrientation.util;
/**
 * @author Saurabh Chaudhari
 * @author Sagar Kale
 * Concrete implemetation for registration of courses
 */

public class Registration implements RegistrationInterface{
	/**
	 * Enum for setting the base price for various stores.
	 */
	public enum RegisterBasePrice{
		Reg(750);
		
		final int regPrice;
		/**
		 * Constructor of base price enum.
		 * @param regPriceIn
		 */
		RegisterBasePrice(int regPriceIn){
			regPrice = regPriceIn;
		}
		
		public int getRegPrice(){
			return regPrice;
		}
	}
	
	/**
	 * Enum for cost associations for
	 * various book stores.
	 */
	public enum RegistrationEn{
		Form(90, (RegisterBasePrice.Reg.getRegPrice()*97)/100, 7, 225),
		RegSystem(45, RegisterBasePrice.Reg.getRegPrice(), 3, 110);
		
		final int duration, carbonFootprint, effort;
		double cost;
		
		/**
		 * Constructor of Cost associations of book stores enum.
		 * @param durationIn
		 * @param costIn
		 * @param carbonFootprintIn
		 * @param effortIn
		 */
		RegistrationEn(int durationIn, int costIn, int carbonFootprintIn, int effortIn){
			Logger.writeOutput("Constructor of RegistrationEn enum is called.", 3);
			duration = durationIn;
			cost = costIn;
			carbonFootprint = carbonFootprintIn;
			effort = effortIn;
		}
	}
	
	public int getFormDuration(){
		return RegistrationEn.Form.duration;
	}
	
	public int getRegSystemDuration(){
		return RegistrationEn.RegSystem.duration;
	}
	
	public double getFormCost(){
		return RegistrationEn.Form.cost;
	}
	
	public double getRegSystemCost(){
		return RegistrationEn.RegSystem.cost;
	}
	
	public int getFormCarbonFootprint(){
		return RegistrationEn.Form.carbonFootprint;
	}
	
	public int getRegSystemCarbonFootprint(){
		return RegistrationEn.RegSystem.carbonFootprint;
	}
	
	public int getFormEffort(){
		return RegistrationEn.Form.effort;
	}
	
	public int getRegSystemEffort(){
		return RegistrationEn.RegSystem.effort;
	}
}