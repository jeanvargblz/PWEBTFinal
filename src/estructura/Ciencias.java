package estructura;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ciencias {
	private int cod_grado;
	private Calendar fecha;
	private ArrayList<Curso_nota> cursos = new ArrayList<Curso_nota>();
	public Ciencias(int grado){
		cod_grado=grado;
	}
	
	
	
	public void setCursos(){
		if(cod_grado==1 | cod_grado==2 |cod_grado==3)
			for(int i=0;i<9;i++)
				cursos.add(new Curso_nota());
		else
			for(int i=0;i<11;i++)
				cursos.add(new Curso_nota());
	}
	
	public ArrayList<Curso_nota> getCursos(){
		return cursos;
	}
	public void setCursos(ArrayList<Curso_nota> cursos){
		this.cursos=cursos;
	}

	public int getCod_grado() {
		return cod_grado;
	}

	public void setCod_grado(int cod_grado) {
		this.cod_grado = cod_grado;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(int Y, int M, int D) {
		
		this.fecha=new GregorianCalendar(Y,M,D);
	}



	@Override
	public String toString() {
		return "Ciencias [cod_grado=" + cod_grado + ", fecha=" + fecha + ", cursos=" + cursos + "]";
	}
	
	
	
	
	
	
}
