package studentOrientation.util;
/**
 * @author Saurabh Chaudhari
 * @author Sagar Kale
 */
import studentOrientation.store.StdoutDisplayInterface;
/**
 * Director Class of builder Pattern
 * Containing Construct method implementation
 */
public class BU2017OrnDirector implements Director{
	private OrientationPlanner ornP;
	/**
	 * Constructor of Concrete Director class
	 * @param ornPIn
	 * @param stdoutIn
	 */
	public BU2017OrnDirector(OrientationPlanner ornPIn, StdoutDisplayInterface stdoutIn){
		Logger.writeOutput("Constructor of BU2017OrnDirector class is called.", 3);
		ornP = ornPIn;
	}
	/**
	 * Implementation of Construct method.
	 */
	public void construct(){
		ornP.campusTour();
		ornP.buyBooks();
		ornP.selectDorm();
		ornP.registration();
	}
	
	public OrientationPlanner getOrnP() {
		return ornP;
	}

	public void setOrnP(OrientationPlanner ornP) {
		this.ornP = ornP;
	}
}
