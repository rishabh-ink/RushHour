package bee.ris.rushhour.data;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class RefreshServlet extends HttpServlet {	
	private void processRequest(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		// TODO Create Place Entity
		
		// TODO Fetch data from foursquare
		
		// TODO Set Place Entity properties: rushhour and current Date object
		
		// TODO Cache refresh over
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		processRequest(req, resp);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		processRequest(req, resp);
	}
}
