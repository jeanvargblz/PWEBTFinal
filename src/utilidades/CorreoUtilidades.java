package utilidades;
import estructura.Correos;
import estructura.DSF;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.appengine.api.datastore.*;
import com.google.appengine.api.datastore.Query.*;
public class CorreoUtilidades {
	
	public static void agregar(String correo, String tipo, boolean condicion ){
		final DatastoreService datastoreService = DSF.getDatastoreService();
		final Correos nuevo = new Correos(correo,tipo,condicion);
		datastoreService.put(nuevo.getEntity());
	}
	public static List<Correos> getEntries(){
		final DatastoreService datastoreService = DSF.getDatastoreService();
		Query q = new Query(Correos.CORREO_LISTA);
		final ArrayList<Correos> lista = new ArrayList<Correos>();
		for (Entity entity: datastoreService.prepare(q).asIterable()) {
			// conversion de las entidades a tutoriales
			lista.add(convertEntityToCorreos (entity));
			System.out.println("pasaste por getEntries");
		}
		System.out.println(lista.size());
		System.out.println(lista.isEmpty());
		return lista;	
	}
	
	public static int NumberOfCorreosLikeThis(List<Correos> lista,String correo){
		int cont=0;
		for(int i=0;i<lista.size();i++){
			lista.get(i).getCorreo().equals(correo);
			cont++;
		}
		return cont;
	}
	
	public static boolean CorreoExist(List<Correos> lista,String correo){
		for(int i=0;i<lista.size();i++){
			if(lista.get(i).getCorreo().equals(correo))
				return true;
		}
		return false;
	}
	
	public static Correos buscarCorreo(List<Correos> lista,String correo){
		if(lista.isEmpty()){
			System.out.println("retorna null por lista vacia");
			return null;
		}
		for(int i=0;i<lista.size();i++){
			if(lista.get(i).getCorreo().equals(correo)) return lista.get(i);
		}
		System.out.println("retorna null porque llego al final osea lista no vacia pero no encontro correo");
		return null;
	}
	
	//Hay 5 tipos de cuenta: alumno,profesor,director,secretario,administrador
	
	private static Correos convertEntityToCorreos (final Entity entity) {
		final String correo = (String) entity.getProperty(Correos.CORREO);
		final String tipo = (String) entity.getProperty(Correos.TIPO);
		String cond = (String)entity.getProperty(Correos.CONDICION);
		final Boolean condicion = Boolean.parseBoolean(cond);
		return new Correos(correo, tipo, condicion);
	}
	
	public static void ModificarCorreo(String co, String correo,String tipo,String condicion){
		final DatastoreService datastore = DSF.getDatastoreService();
		Query q = new Query(Correos.CORREO_LISTA);
		final ArrayList <Entity> lista = new ArrayList<Entity>();
		for(Entity entity: datastore.prepare(q).asIterable()){
			if(entity.getProperty(Correos.CORREO).equals(co)){
				entity.setProperty(Correos.CORREO, correo);
				entity.setProperty(Correos.TIPO, tipo);
				entity.setProperty(Correos.CONDICION, condicion);
				datastore.put(entity);
			}
		}
		
	}
}
