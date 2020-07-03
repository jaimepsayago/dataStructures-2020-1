package unidad1.arrays;

public class Array {

	public static void main(String[] args) {
		
		//declaración
		int [] matriz = new int [5];
		matriz [0] = 5;
		matriz [1] = 4;
		matriz [2] =67;
		
		
		int [] matriz1 = {5,6,98,78,45};
		
		//agregamr dato podemos utilizar for
		//pero serian datos secuenciales o ramdomicos
		
		//Como muestro los datos???????
		//se utiliza un for 
		
		//primera forma
		for (int i = 0; i<matriz1.length; i++)
			System.out.println("datos: " + matriz1[i]);
		//segunda forma for mejorado
		for (int variable:matriz1) {
			System.out.println("datos for each: " + variable);
		}
		
		//arrays en metodos
		int array[] = {1,3,5,6,7};
			//pasar a un metodo
		
		suma(array);
		int arrayMetodo [] = matriz();
		lecturaArrayInt(arrayMetodo);
	}
	//lectura arrays
	public static void lecturaArrayInt(int [] variable ) {
		for (int i = 0; i<variable.length; i++)
			System.out.println("valor array: " + variable[i]);
	}
	//metodo o funcion
	static void suma(int [] variable) {
		int sum=0;
		for(int i = 0; i<variable.length;i++) {
			sum += variable[i];
			
		}
	//enviar
	System.out.println("suma de arrays: " + sum);
	}
	
	static int [] matriz() {
		int [] matriz= {5,4,7,8};
		
		//operaciones
		//retorno matriz
		return matriz;
	}
	
	

}
