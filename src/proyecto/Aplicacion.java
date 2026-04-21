/**
 * 
 */
package proyecto;

//import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
public class Aplicacion {

	public static Scanner teclado = new Scanner(System.in);
	
	public CGrupo grupo = new CGrupo(Grupo.DAM);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void Matricular() {
		System.out.println("A continuacion debe responder con los datos que se solicitan para la matricula");
		
		System.out.println("Introduzca el DNI del alumno");
		String DNI = teclado.nextLine();
		
		System.out.println("Introduzca el nombre del alumno");
		String nombre = teclado.nextLine();
		
		System.out.println("Introduzca la direccion del alumno");
		String direccion = teclado.nextLine();
		
		CAlumno estudiante = new CAlumno(DNI, nombre, direccion);
		
		System.out.println("Introduzca la cantidad de asignaturas del estudiante");
		int cantAsig = Integer.parseInt(teclado.nextLine());
		
		while(cantAsig!=0) {
			System.out.println("Introduzca el nombre de la asignatura");
			//String nombreAsig = teclado.nextLine();
			CAsignatura asig = new CAsignatura(teclado.nextLine());
			
			estudiante.annadirAsignatura(asig);
			cantAsig--;
		
		grupo.annadirAlumno(estudiante);
		}
		
		
	}

	public void BajaAlumno() {
		
	}
	
	
}
