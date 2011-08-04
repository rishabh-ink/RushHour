package bee.ris.rushhour.data;

import java.util.ArrayList;

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
	
	/**
	 * Sets the value of the data to be stored against the hour.
	 * @param when The hour of the day that this value corresponds to.
	 * @param what The value of the data to be assigned at <code>when</code>.
	 * @author Rishabh Rao
	 * @since 0.0.4
	 */
	public void setDataAt(final EHourOfDay when, final T what) {		
		this.data.set(when.getHour(), what);
	}
	
	/**
	 * Gets the value of the data stored against the hour.
	 * @param when The hour of the day that this value corresponds to.
	 * @return The value of the data to be assigned at <code>when</code>.
	 * @author Rishabh Rao
	 * @since 0.0.4
	 */
	public T getDataAt(final EHourOfDay when) {
		return this.data.get(when.getHour());
	}
	
	@Override
	public String toString() {
		// Appending to a StringBuffer is faster than string concatenation.
		StringBuffer returnString = new StringBuffer();
		returnString.append(super.toString())
					.append(" [CLOCK24_HOUR_MAX=" + Timely.CLOCK24_HOUR_MAX) // NOI18N
					.append(", data=" + data.toString()) // NOI18N
					.append("]"); // NOI18N
		return returnString.toString();
	}
}
