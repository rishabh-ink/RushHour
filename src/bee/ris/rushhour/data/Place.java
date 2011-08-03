package bee.ris.rushhour.data;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * This class defines the data storage schema for a <code>Place</code> entity
 * which will be stored in the datastore. It also provides serialization methods
 * for easy storage and retrival.
 * @author Rishabh Rao
 * @since 0.0.2
 */
public class Place {
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
	protected static final int MAX_PLACE_NAME_LENGTH = 256;
	/**
	 * Creates and initializes the <code>Place</code> object for counting.
	 * @param placeId A unique identification code for a place.
	 * @param placeName The venue name of this <code>Place</code>.
	 * @author Rishabh Rao
	 * @since 0.0.5
	 */
	public Place(final String placeId, final String placeName) {
		this.setPlaceName(placeName);
		this.crowdCount = new Timely<Integer>();
		this.refreshCount = new Timely<Integer>();
	}
}