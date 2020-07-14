package unidad3;

import java.util.Scanner;

public class AppFile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ClassFile app = new ClassFile();
	
		System.out.print("Escriba aqui el nombre del archivo");
		app.analizarRuta(entrada.nextLine());

	}

}
