package studentOrientation.store;
/**
 * @author Saurabh Chaudhari
 * @author Sagar Kale
 * Result class to Display results implements StdoutDisplayInterface
 */
import studentOrientation.util.Logger;
import studentOrientation.util.Orientation;
import studentOrientation.util.StudentOrientation;

public class Results implements StdoutDisplayInterface {
	private Orientation ornd;
	/**
	 * Constructor of Results initializes data members.
	 * @param fpIn
	 */
	public Results(){
		Logger.writeOutput("Constructor of Results class is called.", 3);
		ornd = new StudentOrientation();
	}
	
	/**
	 * Writes the contents of data structure in the store to screen.
	 */
	@Override
	public void writeSchedulesToScreen() {
		Logger.writeOutput("TOTAL DURATION: "+ornd.getDuration(),1);
		Logger.writeOutput("TOTAL COST: "+ornd.getCost(),1);
		Logger.writeOutput("TOTAL CARBON FOOTPRINT: "+ornd.getCarbonFootprint(),1);
		Logger.writeOutput("TOTAL EFFORTS: "+ornd.getEfforts(),1);
		Logger.writeOutput("\n", 1);
	}

	public Orientation getOrnd() {
		return ornd;
	}

	public void setOrnd(Orientation ornd) {
		this.ornd = ornd;
	}

}
