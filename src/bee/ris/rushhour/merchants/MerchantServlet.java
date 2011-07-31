package bee.ris.rushhour.merchants;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class MerchantServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
