package unidad4;

public class CalculoFactorial {
// 5! = 5*4*3*2*1
	//declarar un metodo recursivo del factorial
	public long factorial(long numero) {
		//el caso base
		if ( numero <= 1)
			return 1;//final o limite de recursividad
		else //paso recursivo
			return numero * factorial(numero-1);
	}
	
	public void mostrarFactorial() {
		for (int i = 0; i<=10; i++)
		System.out.printf("%d! = %d\n", i, factorial(i));
	}
}

