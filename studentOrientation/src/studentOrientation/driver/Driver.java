package studentOrientation.driver;

/**
 * @author Saurabh Chaudhari
 * @author Sagar Kale
 */
import studentOrientation.util.Logger;
import studentOrientation.store.Results;
import studentOrientation.store.StdoutDisplayInterface;
import studentOrientation.util.BU2017OrientationPlanner;
import studentOrientation.util.BU2017OrnDirector;
import studentOrientation.util.Director;
import studentOrientation.util.BuyBooks.BuyBooksEn;
import studentOrientation.util.CampusTour.CampusTourEn;
import studentOrientation.util.Registration.RegistrationEn;
import studentOrientation.util.SelectingDorm.SelectingDormEn;
import studentOrientation.util.OrientationPlanner;

/**
 *  Student Orientation Program that simply create
 *  schedule for orientation by student choices.
 * @author Saurabh Chaudhari
 * @author Sagar Kale
 *
 */
public class Driver {
	private Results re = null;
	private int debugValue = 0;
	/**
	 * Main method initializes and process.
	 */
	public static void main(String[] args){
		
		try{
			Driver dr = new Driver();
			dr.initialize();
			dr.process();
		}
		catch(NumberFormatException e){
			e.printStackTrace();
			System.exit(-1);
		}
		catch(Exception e){
			e.printStackTrace();
			System.exit(-1);
		}
		finally{
			
		}
	}
	
	/**
	 * Initializes the parameter.
	 */
	private void initialize() {
		debugValue = 1;
		new Logger(debugValue);
		re = new Results();
	}
	
	/**
	 * Builder Pattern driver code.
	 */
	private void process(){
		try{
			OrientationPlanner ornP = new BU2017OrientationPlanner(
					CampusTourEn.BusRide,
					BuyBooksEn.MandoBooks,
					SelectingDormEn.LongQueue,
					RegistrationEn.RegSystem,
					re
					);
			
			StdoutDisplayInterface stdout = new Results();
			
			Director dr = new BU2017OrnDirector(ornP, stdout);
			dr.construct();
			re.writeSchedulesToScreen();
		}
		catch(NullPointerException e){
			e.printStackTrace();
			System.exit(-1);
		}
		catch(Exception e){
			e.printStackTrace();
			System.exit(-1);
		}
		finally{
			
		}
	}
}