package unidad1.arrays;

public class ArraysOperaciones {

	public static void main(String[] args) {
	
		//crear un arrays
		int arreglo[] = {1,2,3,4,5};
		
		System.out.println("mostrar el paso de una referencia"
				+ " entre arrays");
		//recorrer for mejorado
		for(int variable:arreglo)
			System.out.printf("    %d", variable);
		//modificar mi array a traves de un metodo
		
		modificarArray(arreglo);
		System.out.println();
		//imprimir elementos modificados
		for (int variable:arreglo)
			System.out.printf("    %d", variable);
		System.out.println();
		System.out.println("modificar un valor");
		//modificar un solo elemento
		System.out.printf("    %d", arreglo[3]);//8
		
		modificarElemento(arreglo[3]); //8*5
		
		System.out.printf("    %d", arreglo[3]);//8

	}
	static void modificarArray(int arreglo2 []){
		for (int i = 0; i< arreglo2.length;i++) {
			arreglo2[i] *=2;
		}
	}
	
	static void modificarElemento(int elemento){
		elemento *=5;
		System.out.printf("    %d", elemento);
	}

}
