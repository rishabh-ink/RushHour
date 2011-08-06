package bee.ris.rushhour.data;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlaceTest {
	private Place p;	
	private final String placeName = "Some Place";
	private final String placeId = "123456";
	private final int crowdCount = 7;
	private EHourOfDay when = EHourOfDay.AM_1;
	
	@Before
	public void setUp() throws Exception {
		p = new Place(this.placeId, this.placeName);
		p.setCrowdCountAt(this.when, this.crowdCount);
	}

	@Test
	public void testGetPlaceName() {
		assertEquals("Result", this.placeName, p.getPlaceName());
	}

	@Test
	public void testGetPlaceId() {
		assertEquals("Result", this.placeId, p.getPlaceId());
	}

	@Test
	public void testGetCrowdCountAt() {
		assertEquals("Result", this.crowdCount, p.getCrowdCountAt(this.when));
	}

	@Test
	public void testSetCrowdCountAt() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetAverageCrowdCountAt() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testToString() {
		fail("Not yet implemented"); // TODO
	}

}
