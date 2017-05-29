package estructura;


public class Curso_nota {
	String cod_curso;
	String cod_profe;
	String valor_nota;
	
	
	public Curso_nota(){
		cod_curso=null;
		valor_nota=null;
		cod_profe=null;
	}
	
	public Curso_nota(String cod_curso,String cod_profe, String valor_nota) {
		super();
		this.cod_curso = cod_curso;
		this.cod_profe=cod_profe;
		this.valor_nota = valor_nota;
		
	}
	
	
	public String getCod_profe() {
		return cod_profe;
	}

	public void setCod_profe(String cod_profe) {
		this.cod_profe = cod_profe;
	}

	public String getCod_curso() {
		return cod_curso;
	}
	public void setCod_curso(String cod_curso) {
		this.cod_curso = cod_curso;
	}
	public String getValor_nota() {
		return valor_nota;
	}
	public void setValor_nota(String valor_nota) {
		this.valor_nota = valor_nota;
	}
	
	
	
}
