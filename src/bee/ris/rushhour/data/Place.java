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
	 */
	private String placeName;
	/**
	 * The count of the number of people at this venue during all 24 hours of
	 * the day.
	 */
	private int crowdCount;
}
