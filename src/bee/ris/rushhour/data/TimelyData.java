package bee.ris.rushhour.data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * This class holds timely data (all 24 hours of the day.) 
 * @author Rishabh Rao
 * @since 0.0.4
 */
class TimelyData<T> {
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
	public TimelyData() {
		data = (ArrayList<T>)
				Array.newInstance(ArrayList.class, CLOCK24_HOUR_MAX);		   
	}
	
	@Override
	public String toString() {
		// Appending to a StringBuffer is faster than string concatenation.
		StringBuffer returnString = new StringBuffer();
		
		// Find out what type the TimelyDataType is in this object.
		returnString.append(super.toString());
		String timelyDataType = "TimelyDataType: "; // NOI18N
		try {
		timelyDataType +=TimelyData.class.getDeclaredField("data"). // NOI18N
				getGenericType().toString();
		} catch(NoSuchFieldException ex) {
			// If we are not able to find the type, then ignore.
			timelyDataType += ResourceBundle.getBundle("i18n", // NOI18N
				Locale.getDefault()).
				getString("TimelyData.toString.NoSuchFieldException.errorText"); // NOI18N
		}
		
		returnString.append(timelyDataType);
		
		return returnString.toString();
	}
}
