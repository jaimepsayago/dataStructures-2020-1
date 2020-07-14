package unidad3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class AppSaveFile {

	public static void main(String[] args) throws FileNotFoundException {
		Escribir save = new Escribir();
		//save.save();
		Lectura l = new Lectura();
		l.leer();

	}

}
//clase anidada
class Escribir {
	public void save() {
		String frase="esto es un archivo escrito desde java";
		try {
			FileWriter escritura = new FileWriter("d:/archivo.txt");
			for(int i =0; i<frase.length(); i++) {
				escritura.write(frase.charAt(i));
			}
			escritura.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

//clase aninada
class Lectura{
	public void leer() throws FileNotFoundException {
		//ruta de lectura
		FileReader entrada = new FileReader("d:/frase.txt");
	//String frase="esto es un archivo escrito desde java";	
		try {
			int c = entrada.read();
			while(c!=-1) {
				c = entrada.read();//caracteres de uno a uno
				char letra = (char)c;
				System.out.print(letra);
			}
		} catch (Exception e) {
			System.out.println("no se encuentra el archivo");
		} finally {
			try {
				entrada.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
	
}
