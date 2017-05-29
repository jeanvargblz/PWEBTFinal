package estructura;

public class Curso {
	private String cod_curso;
	private String nombre;
	
	public Curso(){
		nombre=null;
		cod_curso=null;
	}
	
	public Curso(String cod_curso, String nombre) {
		super();
		this.cod_curso = cod_curso;
		this.nombre = nombre;
	}

	public String getCod_curso() {
		return cod_curso;
	}


	public void setCod_curso(String cod_curso) {
		this.cod_curso = cod_curso;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
