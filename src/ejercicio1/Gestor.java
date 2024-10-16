package ejercicio1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Gestor {
	Scanner sc = new Scanner(System.in);
	Alumno a1 = new Alumno();

	public void crearAlumno(String ruta) {
		for (int i = 0; i < 3; i++) {

			a1 = new Alumno();
			System.out.println("Introduzca los siguientes datos:");

			System.out.println("Intoduzca el NIA");
			a1.setNia(sc.nextInt());

			sc.nextLine();

			System.out.println("Intoduzca el Nombre");
			a1.setNombre(sc.nextLine());

			System.out.println("Intoduzca el Apellidos");
			a1.setApellidos(sc.nextLine());

			System.out.println("Intoduzca el Genero");

			String genero = sc.nextLine();

			a1.setGenero(genero.charAt(0));

			System.out.println("Intoduzca el Fecha de nacimiento dd/mm/yyyy");

			String fecha = sc.nextLine();

			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

			try {
				a1.setFechaNac(formato.parse(fecha));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Intoduzca el Ciclo");
			a1.setCiclo(sc.nextLine());

			System.out.println("Intoduzca el Curso");
			a1.setCurso(sc.nextLine());

			System.out.println("Intoduzca el Grupo");
			a1.setGrupo(sc.nextLine());
			
			guardarFichero(ruta);
		}

	}
	
	public void guardarFichero(String ruta) {
		File fichero = new File(ruta+".dat");
		DataOutputStream dos;
		try {
			dos = new DataOutputStream(new FileOutputStream(fichero, true));
			dos.writeInt(a1.getNia());
			dos.writeUTF(a1.getNombre());
			dos.writeUTF(a1.getApellidos());
			dos.write(a1.getGenero());
			
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			dos.writeUTF(formato.format(a1.getFechaNac()));
			
			dos.writeUTF(a1.getCiclo());
			dos.writeUTF(a1.getCurso());
			dos.writeUTF(a1.getGrupo());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
