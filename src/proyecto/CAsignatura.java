/**
 * 
 */
package proyecto;

/**
 * 
 */
public class CAsignatura {
	
	private String nombre;
	private int nota;
	
	
	public CAsignatura() {
		
	}
	
	//////////////////
	/// CONSTRUCTOR COPIA
	///////////////////


	/** constructor con argumento nombre
	 * @param nombre
	 */
	public CAsignatura(String nombre) {
		this.nombre = nombre;
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
	 * @return the nota
	 */
	public int getNota() {
		return nota;
	}

	/**
	 * @param nota the nota to set
	 */
	public void setNota(int nota) {
		if (nota<1) {
			this.nota=1;
		}
		else if (nota>10) {
			this.nota=10;
		}
		else {
			this.nota = nota;
		}
	}

	@Override
	public String toString() {
		return  nombre + ":" + nota;
	}
	
	
	
}
