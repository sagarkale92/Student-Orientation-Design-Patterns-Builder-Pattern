package studentOrientation.util;
/**
 * @author Saurabh Chaudhari
 * @author Sagar Kale
 * Concrete Implementation of Effort 
 */

public class Effort implements EffortInterface {
	private int value;
	
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public int getEffortValue() {
		return value;
	}
	public Effort() {
		value = 0;
	}
}
