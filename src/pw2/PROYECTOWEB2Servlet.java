package pw2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class PROYECTOWEB2Servlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/plain");
		req.getRequestDispatcher("WEB-INF/formularios/formSearchCorreo.jsp").forward(req, resp);
	}
}
