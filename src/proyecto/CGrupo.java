/**
 * 
 */
package proyecto;

import java.util.ArrayList;

/**
 * 
 */
public class CGrupo {
	
	private String  grupo;
	private ArrayList<CAlumno> lstAlumnos;
	

	/**
	 * Constructor con grupo y lista de alumnos con tamaño fijado
	 * @param grupo
	 */
	public CGrupo (String grupo){
		this.grupo = grupo;
		lstAlumnos = new ArrayList<CAlumno>(30);
	}
	
	
	
	public CAlumno alumno (int pos) {
		CAlumno estudiante = new CAlumno();
		estudiante = lstAlumnos.get(pos);
		
		return estudiante; 
		}
	
	public void annadirAlumno(CAlumno alum) {
		lstAlumnos.add(alum);
	}
	
	public int numeroALumnos() {
		int numero = 0;
		numero = lstAlumnos.size();
		return numero;
	}
}
