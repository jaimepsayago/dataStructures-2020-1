package unidad3;

import java.io.File;

public class ClassFile {

	public void analizarRuta(String ruta) {
	//creasr un objeto file con ruta ya especificada
	
	File nombre = new File (ruta);
	
	if (nombre.exists()) {
		//muestre la informacion de archivo
		
	System.out.println(
			"Existe: "+ nombre.getName()+"\n"+
			"Si es archivo" + nombre.isFile()+"\n"+
			"Si es directorio" + nombre.isDirectory()+"\n"+
			"ruta absoluta" + nombre.isAbsolute()+"\n"+
			
			"tamaño" + nombre.length()+"\n"+
			"ruta: " + nombre.getPath()+"\n"+
			"padre" + nombre.getParent()+"\n"
				
			);
	
	System.out.printf("%s", "ultima modificacion: ",nombre.lastModified());
	}
	else {
		System.out.println("el archivo no existe");
	}
	
	}
}
