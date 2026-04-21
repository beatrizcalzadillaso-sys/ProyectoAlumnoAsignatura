/**
 * 
 */
package proyecto;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 */
public class CGrupo {
	
	private Grupo grupo;
	private ArrayList<CAlumno> lstAlumnos;
	

	/**
	 * Constructor con grupo y lista de alumnos con tamaño fijado
	 * @param grupo
	 */
	public CGrupo (Grupo grupo){
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
	
	public void eliminarAlumno(String nombre) {
		boolean match = false;
		
		Iterator<CAlumno> itAlumno = lstAlumnos.iterator();
		if(!lstAlumnos.isEmpty()) {
			while(itAlumno.hasNext() && match == false) {   //  ESTAN CORRECTAS EN ESE ORDEN
				CAlumno alum = itAlumno.next();
				if(alum.getNombre().equals(nombre)){
					match=true;
				}
			}
		}
		else {
			System.out.println("La lista de alumnos esta vacia");
		}
		
	}
}
