package bee.ris.rushhour.data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * This class holds timely data (all 24 hours of the day.) 
 * @param <T> The data type that this class must hold. 
 * @author Rishabh Rao
 * @since 0.0.4
 */
class Timely<T> {
	/**
	 * The timely data for all 24 hours of the day, as an array.
	 * @author Rishabh Rao
	 * @since 0.0.4
	 */
	private ArrayList<T> data;
	/**
	 * The maximum number of hours that a 24-hour clock can count is 23 (11am)
	 * as it starts from 0 (12 midnight.)
	 * @author Rishabh Rao
	 * @since 0.0.4
	 */
	private static final int CLOCK24_HOUR_MAX = 23;
	
	/**
	 * This constructor creates an array of length 24 to store a
	 * <code>TimelyDataType</code> object.
	 * @author Rishabh Rao
	 * @since 0.0.4
	 */
	public Timely() {
		data = new ArrayList<T>(CLOCK24_HOUR_MAX);
	}
	
	public void setDataAt(T what, EClockConstants when) {
		
	}
	
	@Override
	public String toString() {
		// Appending to a StringBuffer is faster than string concatenation.
		StringBuffer returnString = new StringBuffer();

		
		
		return returnString.toString();
	}
}
