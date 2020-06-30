package unidad1;

public class Buclesanidados {
//variables constantes
	public static int line = 1;
	public static int line2 = 4;
	public static void main(String[] args) {
	// todas las sentencias del cuerpo del bucle exterior
		//se ejecutan 5 veces.
	//El bucle interno imprime 10 números
		//cada una de esas 5 veces, 
		//para un total de 50 números impresos.
	/*for (int i = 1; i <=5; i++) {
		//System.out.println(i + " ");
		//bucle aninado para imprimr 10 numeros
		for(int j = 1; j <=5; j++) {
			System.out.print(" *"+ " ");
		}
		System.out.println();
	}*/
/*
		//escalera o medio triangulo
		for (int i = 1; i<= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print(".");
			}
			System.out.println(i);
			
			//for(int k = 5; k >= i;k--) {
				//System.out.print("*");
			//}
			//System.out.println(i);
			
		}
	*/
		drawBorde();
	for (line = 1; line <= 4; line++ ) {
		System.out.print("|");
		//spacios en blanco izquierda
		printTopSpacios();
		//valores <> izquierda
		System.out.print("<>");
		//imprimir puntos internos del rombo
		printDots();
		//valores <> derecha
		System.out.print("<>");
		//spacios en blanco derecha
		printTopSpacios();
		
		System.out.println("|");
	}
		
	for (line2 = 4; line2 >= 1; line2--) {
		System.out.print("|");
		
		//spacios en blanco izquierda
		for(int space = 1; space <= (line2 * -2 + 8 ); space ++) {
			System.out.print(" ");
		}
		//valores <> izquierda
		System.out.print("<>");
		
		//imprimir puntos internos del rombo
		for (int dot= 1; dot<=(line2 * 4 - 4);dot ++ ) {
			System.out.print(".");
		}
		//valores <> derecha
		System.out.print("<>");
		//spacios en blanco derecha
		for(int space = 1; space <= (line2 * -2 + 8 ); space ++) {
		System.out.print(" ");
		}
		
		System.out.println("|");
		
	}	
	drawBorde();
		
	//bordes con funciones
	
	
	}

	public static void drawBorde() {
		System.out.print("#");
		for(int i = 1; i <= 16; i ++) {
			System.out.print("=");
		}
		System.out.println("#");
	}
	
	public static void printTopSpacios() {
		for(int space = 1; space <= (line * -2 + 8 ); space ++) {
			System.out.print(" ");
		}
	}
	
	public static void printDots() {
		for (int dot= 1; dot<=(line * 4 - 4);dot ++ ) {
			System.out.print(".");
		}
	}
	
	
}
