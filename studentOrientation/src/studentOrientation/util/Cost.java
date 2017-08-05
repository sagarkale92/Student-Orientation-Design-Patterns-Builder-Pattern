package studentOrientation.util;
/**
 * @author Saurabh Chaudhari
 * @author Sagar Kale
 * Concrete Implementation for Cost.
 */

public class Cost implements CostInterface {
	private double value;

	public void setValue(double valueIn) {
		value = valueIn;
	}
	@Override
	public double getCostValue() {
		return value;
	}
	public Cost() {
		value = 0;
	}

}
