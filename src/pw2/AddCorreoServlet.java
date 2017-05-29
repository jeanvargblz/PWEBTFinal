package pw2;

import utilidades.CorreoUtilidades;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class AddCorreoServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String correo=req.getParameter("correo"),tipo=req.getParameter("tipo");
		boolean condicion=Boolean.parseBoolean(req.getParameter("condicion"));
		CorreoUtilidades.agregar(correo,tipo,condicion);
		resp.setContentType("text/html");	
		
		resp.getWriter().println("<!DOCTYPE html>"	 
									+ "<html>"
									+ "<head><title>Información de la cuenta</title>"
									+ "<meta charset=utf-8;>"
									+ "<body>"
									+ "<h1>Información de la Cuenta Google</h1>"
									+ "<br><a href='../'>Regresar...</a>"
									+"<br/><b>User :</b>"
									+"<br/>Email: "+correo
									+"<br/>Tipo: "+tipo
									+"<br/>Condicion: "+condicion
									+"<br/>"
									+"<br/><a href='/adminoptions'> Opciones de administrador</a>"
									+ "</body></html>");
	}
}
