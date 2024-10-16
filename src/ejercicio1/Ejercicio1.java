package ejercicio1;

import java.util.Scanner;

/**
 * Esta clase es la clase principal en la cual se ejecutan los metodos creados
 * @author Ayoub Rehouni
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la ruta del archivo");
		String ruta = sc.nextLine();
		Gestor g = new Gestor();
		g.crearAlumno(ruta);

	}
}
