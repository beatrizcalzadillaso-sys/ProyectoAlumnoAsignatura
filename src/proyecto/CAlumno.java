/**
 * 
 */
package proyecto;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 */
public class CAlumno {
	
	public String dni;
	public String nombre;
	public String direccion;
	public ArrayList<CAsignatura> lstAsignatura;
	
	
	public CAlumno() {
		
	}
	
	public CAlumno(String dni, String nombre, String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		lstAsignatura = new ArrayList<CAsignatura>(10);
	}
	
		
	//////////////////
	/// CONSTRUCTOR COPIA
	///////////////////
		
	/**
	 * @param dni
	 * @param nombre
	 * @param direccion
	 */
	
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the lstAsignatura
	 */
	public ArrayList<CAsignatura> getLstAsignatura() {
		return lstAsignatura;
	}
	
	/**
	 * @param lstAsignatura the lstAsignatura to set
	 */
	public void setLstAsignatura(ArrayList<CAsignatura> lstAsignatura) {
		this.lstAsignatura = lstAsignatura;
	}
	
	
	/**
	 * devuelve el objeto CAsignatura que ocupa la posición pos
	 * @param pos
	 * @return CAsignatura
	 */
	public CAsignatura obtenerAsignatura(int pos) {
		CAsignatura asig = new CAsignatura();
		
		try {
			asig = lstAsignatura.get(pos);			
		}
		catch (ArrayIndexOutOfBoundsException err) {
			asig = null;
		}
		
		return asig;
	}
	
	/**
	 * Añade el objeto CAsignatura pasado como argumento al final de la matriz de asignaturas
	 * @param newAsig
	 */
	public void annadirAsignatura(CAsignatura newAsig) {
		lstAsignatura.add(newAsig);
	}
	
	/**
	 * Devuelve el numero de elementos de la matriz asignaturas
	 * @return
	 */
	public int numAsig() {
		int num= lstAsignatura.size();
		return num;
	}
	
	/**
	 * devuelve la nota media del alumno
	 * @return
	 */
	public double obtenerNotaMedia() {
		int sumNotas=0;
		
		Iterator<CAsignatura> itAsignatura = lstAsignatura.iterator();
		
		while (itAsignatura.hasNext()) {
			CAsignatura cAs = itAsignatura.next();
			sumNotas = sumNotas + cAs.getNota();
		}
		
		double average = sumNotas / (lstAsignatura.size());
		return average;
	}


	@Override
	public String toString() {
		return "CAlumno:  \n[Dni:" + dni + ", Nombre:" + nombre + ", Direccion:" + direccion + ", numAsig()=" + numAsig() + " \n notas:" + imprimirNotas() + "\n, Nota media: " + obtenerNotaMedia() + "]";
	}
	
	public void imprimirNotas() {
		Iterator<CAsignatura> itAsignatura = lstAsignatura.iterator();
		while (itAsignatura.hasNext()) {
			CAsignatura cAs = itAsignatura.next();
			System.out.println(cAs.toString());
		}
	}
	
}
