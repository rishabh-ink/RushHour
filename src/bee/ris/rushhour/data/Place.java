package bee.ris.rushhour.data;

import java.util.Locale;
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
	 * @author Rishabh Rao
	 * @since 0.0.5
	 */
	private String placeId;
	/**
	 * The venue that this <code>Place</code> holds data for.
	 * @author Rishabh Rao
	 * @since 0.0.4
	 */
	private String placeName;
	/**
	 * The count of the number of people at this venue during all 24 hours of
	 * the day.
	 * @author Rishabh Rao
	 * @since 0.0.5
	 */
	private Timely<Integer> crowdCount;
	/**
	 * The number of times the <code>crowdCount</code> has been updated.
	 * @author Rishabh Rao
	 * @since 0.0.5
	 */
	private Timely<Integer> refreshCount;
	/**
	 * The maximum number of characters that a place name can contain.
	 * @author Rishabh Rao
	 * @since 0.0.5
	 */
	protected static final int MAX_PLACE_NAME_LENGTH = 32;
	/**
	 * The maximum number of characters that a place name can contain.
	 * @author Rishabh Rao
	 * @since 0.0.5
	 */
	protected static final int MAX_PLACE_ID_LENGTH = 32;
	/**
	 * Creates and initializes the <code>Place</code> object for counting.
	 * @param placeId A unique identification code for a place.
	 * @param placeName The venue name of this <code>Place</code>.
	 * @author Rishabh Rao
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
	 * @author Rishabh Rao
	 * @since 0.0.5
	 */
	private void setPlaceName(final String placeName)
			throws IllegalArgumentException {
		if(l.isLoggable(Level.FINER)) {				 // NOI18N
			l.entering(Place.class.getSimpleName(), "setPlaceName", placeName);
		}
		
		// Don't allow nulls or blanks.
		if(null == placeName || 0 == placeName.length()) {
			throw new IllegalArgumentException(ResourceBundle.
				getBundle("i18n").  // NOI18N
				getString("Place.set.IllegalArgumentException"));
		}

		// Don't allow long names.
		if(Place.MAX_PLACE_NAME_LENGTH <= placeName.length()) {
			this.placeName = placeName.substring(0, Place.MAX_PLACE_NAME_LENGTH);
		} else {
			this.placeName = placeName;
		}
		
		if(l.isLoggable(Level.FINER)) {				// NOI18N
			l.exiting(Place.class.getSimpleName(), "setPlaceName", this.placeName);
		}
	}
	/**
	 * Sets the <code>placeName</code>.
	 * @param placeName The venue that this <code>Place</code> holds data for.
	 * @author Rishabh Rao
	 * @since 0.0.5
	 */
	private void setPlaceId(final String placeId)
			throws IllegalArgumentException {
		if(l.isLoggable(Level.FINER)) {				 // NOI18N
			l.entering(Place.class.getSimpleName(), "setPlaceId", placeId);
		}
		
		// Don't allow nulls or blanks.
		if(null == placeId || 0 == placeId.length()) {
			throw new IllegalArgumentException(ResourceBundle.
				getBundle("i18n"). // NOI18N
				getString("Place.set.IllegalArgumentException")); // NOI18N
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
	 * The logger for the <code>Place</code> class.
	 */
	private static Logger l = Logger.getLogger(Place.class.getSimpleName());
}