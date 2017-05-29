package estructura;

public class Alumno extends Persona {
	private String cod_alumno;
	private Notas notas;
	private int grado;
	public Alumno() {
		super();
		cod_alumno=null;
		notas=null;
		grado=0;
	}
	public Alumno(String nombres, String ap_paterno, String ap_materno, String dNI, String correo,String cod_alumno,Notas notas,int grado) {
		super(nombres, ap_paterno, ap_materno, dNI, correo);
		this.cod_alumno=cod_alumno;
		this.notas=notas;
		this.grado=grado;
	}
	public String getCod_alumno() {
		return cod_alumno;
	}
	public void setCod_alumno(String cod_alumno) {
		this.cod_alumno = cod_alumno;
	}
	public Notas getNotas() {
		return notas;
	}
	public void setNotas(Notas notas) {
		this.notas = notas;
	}
	public int getGrado() {
		return grado;
	}
	public void setGrado(int grado) {
		this.grado = grado;
	}
	
	
	
	
}
