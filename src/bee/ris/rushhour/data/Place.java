package bee.ris.rushhour.data;

/**
 * This class defines the data storage schema for a <code>Place</code> entity
 * which will be stored in the datastore. It also provides serialization methods
 * for easy storage and retrival.
 * @author Rishabh Rao
 * @since 0.0.2
 */
public class Place {
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
	public static final int MAX_PLACE_NAME_LENGTH = 256;
	
	public Place(final String placeName) {
		
	}

	/**
	 * @return The venue that this <code>Place</code> holds data for.
	 * @author Rishabh Rao
	 * @since 0.0.5
	 */
	public String getPlaceName() {
		return placeName;
	}

	/**
	 * @param placeName The venue that this <code>Place</code> holds data for.
	 * @author Rishabh Rao
	 * @since 0.0.5
	 */
	public void setPlaceName(final String placeName) {
		// Do not allow lengthly place names.
		if(placeName.length() >= Place.MAX_PLACE_NAME_LENGTH) {
			// Truncate if required.
			placeName.substring(0, Place.MAX_PLACE_NAME_LENGTH);
		}
		
		this.placeName = placeName;
	}
}
