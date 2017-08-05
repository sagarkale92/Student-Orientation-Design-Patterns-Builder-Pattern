package studentOrientation.util;
/**
 * @author Saurabh Chaudhari
 * @author Sagar Kale
 * Concrete Implementation of Duration Interface.
 */

public class Duration implements DurationInterface {

	private int value;
	
	public void setValue(int valueIn) {
		value = valueIn;
	}

	@Override
	public int getDuration() {
		return value;
	}

	public Duration() {
		value = 0;
	}

}
