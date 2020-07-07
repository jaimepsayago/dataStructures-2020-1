package unidad1.arrays;

public class Matriz {

	public static void main(String[] args) {
		//arreglos bidimensionales
		
		int arreglo1[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		int arreglo2[][] = {
				{1,2},
				{3},
				{4,5,6},
		};
		
		//imprimir los arreglos con metodos
		imprimirArreglo(arreglo1);
		imprimirArreglo(arreglo2);
	}
	static void imprimirArreglo(int arreglo [][]) {
		//iterar o recorrer o repetir
		//recorrido por fila
		for (int i = 0; i<arreglo.length; i++) {
			//iteracion por columna de la fila actual
			for (int j = 0; j<arreglo[i].length;j++) {
				System.out.printf("%d ",  arreglo[i][j]);
			}
		System.out.println();
		}
		
	}
	
	/*manipulacion
	for (int j = 0; j<arreglo[i].length;j++) {
				System.out.printf("%d ",  arreglo[i][j]);
			} 
			if i = 2y j =1
			arreglo [i] j] = xxx
			
	TAREA EN CLASE 7.10 EJEMPLO PRACTICA LIBRO DE CALIFICACIONES DEL
	LIBRO DEITEL.... BIDIMENSIONAL ARREGLO
			*/

}
