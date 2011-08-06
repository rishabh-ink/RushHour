package bee.ris.rushhour.data;

import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class defines the data storage schema for a <code>Place</code> entity
 * which will be stored in the datastore. It also provides serialization methods
 * for easy storage and retrival.
 * @author Rishabh Rao
 * @since 0.0.2
 */
class Place {
	/**
	 * A unique identification code for a place.
	 * @since 0.0.5
	 */
	private String placeId;
	/**
	 * The venue that this <code>Place</code> holds data for.
	 * @since 0.0.4
	 */
	private String placeName;
	/**
	 * The count of the number of people at this venue during all 24 hours of
	 * the day.
	 * <p><code>crowdCount</code> does not store the average crowd count of the
	 * count collected over a period of time. Instead, it keeps a total of all
	 * the counts collected over a period of time.</p>
	 * <p>Thus, <code>crowdCount</code> divided by <code>refreshCount</code>
	 * will give us the average crowd at that location.</p>
	 * @see Timely
	 * @since 0.0.5
	 */
	private Timely<Integer> crowdCount;
	/**
	 * The number of times the <code>crowdCount</code> has been updated.
	 * <p>Thus, <code>crowdCount</code> divided by <code>refreshCount</code>
	 * will give us the average crowd at that location.</p>
	 * @see Timely
	 * @since 0.0.5
	 */
	private Timely<Integer> refreshCount;
	/**
	 * The maximum number of characters that a place name can contain.
	 * @since 0.0.5
	 */
	protected static final int MAX_PLACE_NAME_LENGTH = 32;
	/**
	 * The maximum number of characters that a place name can contain.
	 * @since 0.0.5
	 */
	protected static final int MAX_PLACE_ID_LENGTH = 32;
	/**
	 * Creates and initializes the <code>Place</code> object for counting.
	 * @param placeId A unique identification code for a place.
	 * @param placeName The venue name of this <code>Place</code>.
	 * @since 0.0.5
	 */
	public Place(final String placeId, final String placeName) {
		if(l.isLoggable(Level.FINER)) {				 // NOI18N
			l.entering(Place.class.getSimpleName(), "Place",
					new Object[] {placeId, placeName});
		}
		
		this.setPlaceId(placeId);
		this.setPlaceName(placeName);
		this.crowdCount = new Timely<Integer>();
		this.refreshCount = new Timely<Integer>();
		
		if(l.isLoggable(Level.FINER)) {				// NOI18N
			l.exiting(Place.class.getSimpleName(), "Place");
		}
	}
	/**
	 * Sets the <code>placeName</code>.
	 * @param placeName The venue that this <code>Place</code> holds data for.
	 * @since 0.0.5
	 */
	private void setPlaceName(final String placeName)
			throws IllegalArgumentException {
		if(l.isLoggable(Level.FINER)) {				 // NOI18N
			l.entering(Place.class.getSimpleName(), "setPlaceName", placeName);
		}
		
		// Don't allow nulls or blanks.
		if(null == placeName || 0 == placeName.length()) {
			throw new IllegalArgumentException("placeName" + // NOI18N
					ResourceBundle.getBundle("i18n").  // NOI18N
					getString("Place.set.IllegalArgumentException") + // NOI18N
					placeName);
		}

		// Don't allow long names.
		if(Place.MAX_PLACE_NAME_LENGTH <= placeName.length()) {
			this.placeName = placeName.substring(0, Place.MAX_PLACE_NAME_LENGTH);
		} else {
			this.placeName = placeName;
		}
		
		if(l.isLoggable(Level.FINER)) {				
			l.exiting(Place.class.getSimpleName(), "setPlaceName", // NOI18N
					this.placeName);
		}
	}
	/**
	 * Gets the <code>placeName</code>.
	 * @return The venue that this <code>Place</code> holds data for.
	 * @since 0.0.6
	 */
	public String getPlaceName() {
		return this.placeName;
	}
	/**
	 * Sets the <code>placeId</code>.
	 * @param placeId A unique identification code for a place.
	 * @since 0.0.5
	 */
	private void setPlaceId(final String placeId)
			throws IllegalArgumentException {
		if(l.isLoggable(Level.FINER)) {				 // NOI18N
			l.entering(Place.class.getSimpleName(), "setPlaceId", placeId);
		}
		
		// Don't allow nulls or blanks.
		if(null == placeId || 0 == placeId.length()) {
			throw new IllegalArgumentException("placeId" + // NOI18N
					ResourceBundle.getBundle("i18n"). // NOI18N
					getString("Place.set.IllegalArgumentException") + // NOI18N
					placeId);
		}

		// Don't allow long names.
		if(Place.MAX_PLACE_ID_LENGTH <= placeId.length()) {
			this.placeId = placeId.substring(0, Place.MAX_PLACE_NAME_LENGTH);
		} else {
			this.placeId = placeId;
		}
		
		if(l.isLoggable(Level.FINER)) {				// NOI18N
			l.exiting(Place.class.getSimpleName(), "setPlaceId", this.placeId);
		}
	}
	/**
	 * Gets the <code>placeId</code>.
	 * @return The unique identification code for this <code>Place</code>.
	 * @since 0.0.6
	 */
	public String getPlaceId() {
		return this.placeId;
	}
	/**
	 * Gets the number of people at this <code>Place</code> at a given <code>
	 * EHourOfDay</code>.
	 * @param when The hour of the day for which the data is required.
	 * @return The crowd count at that hour.
	 * @since 0.0.6
	 */
	public int getCrowdCountAt(final EHourOfDay when) {
		return ((this.crowdCount.getDataAt(when)).intValue());
	}
	/**
	 * Set the crowd count at the given hour of the day.
	 * @param when The hour of the day for which the data is to be set.
	 * @param what The new crowd count at that hour.
	 * @since 0.0.7
	 */
	public void setCrowdCountAt(final EHourOfDay when, final int what) {
		if(l.isLoggable(Level.FINER)) {				 // NOI18N
			l.entering(Place.class.getSimpleName(), "setCrowdCountAt",
						new Object[] {when, what});
		}
		// Do not allow negative values to be set.
		if(what < 0) {
			throw new IllegalArgumentException("crowdCount" + // NOI18N
					ResourceBundle.getBundle("i18n"). // NOI18N
					getString("Place.set.IllegalArgumentException") + // NOI18N
					what);
		}
		
		// crowdCount does not store the average crowd count of the count
		// collected over a period of time. Instead, it keeps a total of all
		// the counts collected over a period of time.
		// refreshCount stores how many times the crowdCount values was changed.
		// Thus, crowdCount divided by refreshCount will give us the average
		// crowd at that location.
		int previousCrowdCount = this.crowdCount.getDataAt(when);
		int nextCrowdCount = previousCrowdCount + what;

		if(l.isLoggable(Level.FINEST)) {
			l.log(Level.FINEST, "crowdCount", // NOI18N
				new Object[] {previousCrowdCount, what, nextCrowdCount});
		}

		this.crowdCount.setDataAt(when, nextCrowdCount);

		// The refreshCount should always be incremented as and when the 
		// crowd count value is changed.
		int previousRefreshCount = this.refreshCount.getDataAt(when);
		int nextRefreshCount = previousCrowdCount + 1;
		
		if(l.isLoggable(Level.FINEST)) {
			l.log(Level.FINEST, "refreshCount", // NOI18N
				new Object[] {previousRefreshCount, nextRefreshCount});
		}
		
		this.refreshCount.setDataAt(when, nextRefreshCount);
		
		if(l.isLoggable(Level.FINER)) {				// NOI18N
			l.exiting(Place.class.getSimpleName(), "setCrowdCountAt");
		}
	}
	/**
	 * Gets the number of times the <code>crowdCount</code> at this
	 * <code>Place</code> at a given <code>EHourOfDay</code> was refreshed.
	 * @param when The hour of the day for which the data is required.
	 * @return The refresh count at that hour.
	 * @since 0.0.6
	 */
	private int getRefreshCountAt(final EHourOfDay when) {
		return ((this.refreshCount.getDataAt(when)).intValue());
	}
	/**
	 * A convenience method to get an average crowd count at a given time.
	 * @param when The hour of the day for which the data is required.
	 * @return The average crowd count.
	 * @since 0.0.6
	 */
	public int getAverageCrowdCountAt(final EHourOfDay when) {
		if(l.isLoggable(Level.FINER)) {
			l.entering(Place.class.getSimpleName(),
					"getAverageCrowdCountAt", when); // NOI18N
		}
		
		int averageCrowdCount = ((this.getCrowdCountAt(when)) /
				(this.getRefreshCountAt(when)));
		
		if(l.isLoggable(Level.FINER)) {
			l.exiting(Place.class.getSimpleName(), "setCrowdCountAt", // NOI18N
					averageCrowdCount);
		}
		
		return averageCrowdCount;
	}
	/**
	 * The logger for the <code>Place</code> class.
	 * @since 0.0.6
	 */
	private static Logger l = Logger.getLogger(Place.class.getSimpleName());
	@Override
	public String toString() {
		StringBuilder returnString = new StringBuilder();
		
		returnString.append(super.toString())
					.append(" ")
					.append(Place.class.getSimpleName())
					.append(":[placeId=").append(this.getPlaceId())
					.append(",placeName=").append(this.getPlaceName())
					.append(",MAX_PLACE_NAME_LENGTH=")
					.append(Place.MAX_PLACE_NAME_LENGTH)
					.append(",MAX_PLACE_ID_LENGTH=")
					.append(Place.MAX_PLACE_ID_LENGTH)
					.append("]");
		
		return returnString.toString();
	}
}