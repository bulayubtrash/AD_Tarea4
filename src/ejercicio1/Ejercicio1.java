package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca la ruta del archivo");
		String ruta=sc.nextLine();
		File fichero = new File(ruta+".dat");
		FileOutputStream ficheroSalida;
		try {
			ficheroSalida = new FileOutputStream(fichero);
			ObjectOutputStream dataOS = new ObjectOutputStream(ficheroSalida);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
