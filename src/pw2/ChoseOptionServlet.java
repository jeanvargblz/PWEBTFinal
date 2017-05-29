package pw2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ChoseOptionServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html");
			req.getRequestDispatcher("WEB-INF/jsp/adminoptions.jsp").forward(req, resp);
	}
}
