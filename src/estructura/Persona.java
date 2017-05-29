package estructura;

public class Persona {
	private String nombres,ap_paterno,ap_materno;
	private String DNI,correo;
	
	public Persona(){
		nombres=null;
		ap_materno=null;
		ap_paterno=null;
		DNI=null;
		correo=null;
	}

	public Persona(String nombres, String ap_paterno, String ap_materno, String dNI, String correo) {
		super();
		this.nombres = nombres;
		this.ap_paterno = ap_paterno;
		this.ap_materno = ap_materno;
		DNI = dNI;
		this.correo = correo;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getAp_paterno() {
		return ap_paterno;
	}

	public void setAp_paterno(String ap_paterno) {
		this.ap_paterno = ap_paterno;
	}

	public String getAp_materno() {
		return ap_materno;
	}

	public void setAp_materno(String ap_materno) {
		this.ap_materno = ap_materno;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}
