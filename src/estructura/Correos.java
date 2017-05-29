package estructura;

import com.google.appengine.api.datastore.Entity;

public class Correos {
	public static final String CORREO_LISTA ="Correos";
	public static final String CORREO = "correo";
	//puede haber 5 tipos de condicion
	//alumno,profesor,director,secretario,administrador
	public static final String TIPO = "tipo";
	public static final String CONDICION = "condicion";
	private Entity entity = new Entity(CORREO_LISTA);
	
	public Correos(String correo, String tipo, boolean condicion){
		entity.setProperty(CORREO, correo);
		entity.setProperty(TIPO, tipo);
		entity.setProperty(CONDICION, condicion+"");
		
	}
	public String getCorreo(){
		return (String) entity.getProperty(CORREO);
	}
	public String getTipo(){
		return (String) entity.getProperty(TIPO);
	}
	public boolean getCondicion(){
		return Boolean.parseBoolean((String) entity.getProperty(CONDICION)); 
	}
	public Entity getEntity(){
		return entity;
	}
}
