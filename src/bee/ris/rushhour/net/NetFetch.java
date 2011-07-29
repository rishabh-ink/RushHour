package bee.ris.rushhour.net;

import fi.foyt.foursquare.api.FoursquareApi;
import fi.foyt.foursquare.api.FoursquareApiException;
import fi.foyt.foursquare.api.Result;
import fi.foyt.foursquare.api.entities.CompleteVenue;

public class NetFetch {
	public void search() throws FoursquareApiException {
		FoursquareApi f;
		
		Result<CompleteVenue> cv = f.venue("SDSd");
		
		cv.getResult().getHereNow();
	}
}
