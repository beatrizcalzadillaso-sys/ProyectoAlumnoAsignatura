/**
 * 
 */
package proyecto;

import java.util.ArrayList;

/**
 * 
 */
public class CAlumno {
	
	public String dni;
	public String nombre;
	public String direccion;
	public ArrayList<CAsignatura> lstAsignatura;
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
}
