package studentOrientation.util;
/**
 * @author Saurabh Chaudhari
 * @author Sagar Kale
 * Concrete implementation of Carbon FootPrint
 */
public class CarbonFootPrint implements CarbonFootPrintInterface {

	private int value;
	
	public void setValue(int valueIn) {
		value = valueIn;
	}
	@Override
	public int getCarbonFootPrintValue() {
		return value;
	}
	public CarbonFootPrint() {
		value = 0;
	}
}
