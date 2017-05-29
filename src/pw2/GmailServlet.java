package pw2;

import utilidades.CorreoUtilidades;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.users.*;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

import estructura.Correos;

@SuppressWarnings("serial")
public class GmailServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		UserService us = UserServiceFactory.getUserService();
		User user = us.getCurrentUser();
		Correos elegido;
		List<Correos> lista = CorreoUtilidades.getEntries();
		out.println(lista.size());
		
		if(user==null){
			resp.sendRedirect(us.createLoginURL("/Login.jsp"));
		}
		else{
			System.out.println(user.getEmail());
			if(user.getEmail().equals("jeanvargblz@gmail.com") | user.getEmail().equals("jeanvargblz@gmail.com")){
				req.getRequestDispatcher("/WEB-INF/jsp/adminoptions.jsp").forward(req, resp);
			}else
			if(lista.isEmpty()){
				System.out.println("lista vacia causa");
				resp.sendRedirect("Pagina.html");
			}
			else{
				if(CorreoUtilidades.buscarCorreo(lista,user.getEmail())!=null){
					elegido=CorreoUtilidades.buscarCorreo(lista,user.getEmail());
					if(elegido.getTipo().equals("administrador")){	
						if(elegido.getCondicion()){
							out.println("<!DOCTYPE html>"	 
									+ "<html>"
									+ "<head><title>Información de la cuenta</title>"
									+ "<meta charset=utf-8;>"
									+ "<body style='background-color:blue;'>"
									+ "<center>"
									+ "<div style='background-color:Chartreuse;color:blue;padding:20px;'>"
									+ "<h1>Información de la Cuenta Google</h1>"
									+ "<br/><b>User :</b>"
									+"<br/>Nickname: "+user.getNickname()
									+"<br/>Email: "+user.getEmail()
									+"<br/><img src='imagenes/rey.jpg'> "
									+"<br/>"
									+"<form role='form' action='/choseOption' method='post'>"
									+"<div class='form-group'>"
									+"<label for='ejemplo_password_1'>Tipo</label><select"
									+"class='form-control' id='sel1' name='opcion'>"
									+"<option value='adminoptions'>Opciones de administrador</option>"
									+"</select>"
									+"</div>"
									+"<button type='submit' class='btn btn-sm btn-primar'>Ir</button>"
									+"</form>"
									+"<br/>"
									+"<br/><a href='../'>Regresar...</a>"
									+"<br/><a href='"+ us.createLogoutURL("http://1-dot-profar-167808.appspot.com")+"'> Cerrar sesión </a>"
									+ "</div></center></body></html>");
						}
						else{
							out.println("Su cuenta es de administrador pero está inactiva contactese con el administrador principal");
						}		 
					}
					else if(elegido.getTipo().equals("estudiante")){
						if(elegido.getCondicion()){
							out.println("<!DOCTYPE html>"	 
									+ "<html>"
									+ "<head><title>Información de la cuenta</title>"
									+ "<meta charset=utf-8;>"
									+ "<body style='background-color:blue;'>"
									+ "<center>"
									+ "<div style='background-color:lightblue;color:blue;padding:20px;'>"
									+ "<h1>Información de la Cuenta Google</h1>"
									+ "<br/><b>User :</b>"
									+"<br/>getNickname retornó : "+user.getNickname()
									+"<br/>getEmail retornó : "+user.getEmail()
									+"<br/><img src='imagenes/peon.jpg'> "
									+"<br/>"
									+"<br/><a href='../'>Regresar...</a>"
									+"<br/><a href='"+ us.createLogoutURL("http://1-dot-profar-167808.appspot.com")+"'> Cerrar sesión </a>"
									+ "</div></center></body></html>");
						}
						else{
							out.println("Su cuenta es de estudiante pero está inactiva contactese con el administrador principal");
						}
					}
					
					
					else if(elegido.getTipo().equals("profesor")){
						if(elegido.getCondicion()){
							out.println("<!DOCTYPE html>"	 
									+ "<html>"
									+ "<head><title>Información de la cuenta</title>"
									+ "<meta charset=utf-8;>"
									+ "<body style='background-color:blue;'>"
									+ "<center>"
									+ "<div style='background-color:LightSeaGreen;color:blue;padding:20px;'>"
									+ "<h1>Información de la Cuenta Google</h1>"
									+ "<br/><b>User :</b>"
									+"<br/>getNickname retornó : "+user.getNickname()
									+"<br/>getEmail retornó : "+user.getEmail()
									+"<br/><img src='imagenes/torre.jpg'> "
									+"<br/>"
									+"<br/><a href='../'>Regresar...</a>"
									+"<br/><a href='"+ us.createLogoutURL("http://1-dot-profar-167808.appspot.com")+"'> Cerrar sesión </a>"
									+ "</div></center></body></html>");
						}
						else{
							out.println("Su cuenta es de Profesor pero está inactiva contáctese con el admin principal");
						}
					}
					
					
					else if(elegido.getTipo().equals("director")){
						if(elegido.getCondicion()){
							out.println("<!DOCTYPE html>"	 
									+ "<html>"
									+ "<head><title>Información de la cuenta</title>"
									+ "<meta charset=utf-8;>"
									+ "<body style='background-color:blue;'>"
									+ "<center>"
									+ "<div style='background-color:Tomato;color:blue;padding:20px;'>"
									+ "<h1>Información de la Cuenta Google</h1>"
									+ "<br/><b>User :</b>"
									+"<br/>getNickname retornó : "+user.getNickname()
									+"<br/>getEmail retornó : "+user.getEmail()
									+"<br/><img src='imagenes/reina.jpg'> "
									+"<br/>"
									+"<br/><a href='../'>Regresar...</a>"
									+"<br/><a href='"+ us.createLogoutURL("http://1-dot-profar-167808.appspot.com")+"'> Cerrar sesión </a>"
									+ "</div></center></body></html>");
							
						}
						else{
							out.println("Su cuenta es de Director pero está inactiva contáctese con el admin principal");
						}
					}
					
					
					else if(elegido.getTipo().equals("secretario")){
						if(elegido.getCondicion()){
							out.println("<!DOCTYPE html>"	 
									+ "<html>"
									+ "<head><title>Información de la cuenta</title>"
									+ "<meta charset=utf-8;>"
									+ "<body style='background-color:blue;'>"
									+ "<center>"
									+ "<div style='background-color:Gold;color:blue;padding:20px;'>"
									+ "<h1>Información de la Cuenta Google</h1>"
									+ "<br/><b>User :</b>"
									+"<br/>getNickname retornó : "+user.getNickname()
									+"<br/>getEmail retornó : "+user.getEmail()
									+"<br/><img src='imagenes/alfil.jpg'> "
									+"<br/>"
									+"<br/><a href='../'>Regresar...</a>"
									+"<br/><a href='"+ us.createLogoutURL("http://1-dot-profar-167808.appspot.com")+"'> Cerrar sesión </a>"
									+ "</div></center></body></html>");
							
						}
						else{
							out.println("Su cuenta es de Secretario pero está inactiva contáctese con el admin principal");
						}
					}
				}
				else{
					resp.sendRedirect("Pagina.html");
				}
			}
		}
		
	}
}