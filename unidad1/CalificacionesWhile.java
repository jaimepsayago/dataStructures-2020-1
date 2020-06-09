package unidad1;

import java.util.Scanner;

public class CalificacionesWhile {

	public static void main(String[] args) {
		mostrarMensaje();
		determinarPromedio();

	}
	public static void mostrarMensaje() {
		System.out.print("calificaciones");
	
	}
	public static void determinarPromedio() {
		Scanner entrada = new Scanner(System.in);
		int total=0, contadorCalif, calificacion, promedio;
		
		//inicializar
		total = 0;
		contadorCalif=1;
		
		//procesar
		while(contadorCalif <= 10) {
			System.out.print("ingrese calificacion");
			calificacion = entrada.nextInt();
			total = total+calificacion;
		contadorCalif++;
		}
		
		promedio = total /10;
	
	System.out.print("\n el total de califaciones es"+ total);
	System.out.print("\n el promedio de califaciones es"+ promedio);
	}

}
