package unidad1;

import java.util.NoSuchElementException;

public class Bucles {

	public static void main(String[] args)
		 {
		
		//for basico
		// for (int i =0; i <5; i++){
		//  ejecuta procedimientos
		//}
		
		//for complejo
		//for (int i = 1, j= i + 10; i<5; 
			//	i++,j = i*2) 
			//{
		// System.out.println("i= " + i + "j = " + j)	;
		//}

		//break y continue
		
		/*for (int i=0; i<100; i++) {
			if (i == 74)// break;//salir del bucle for
			//System.out.println("el valor es:"+ i);
			//if (i % 9 != 0) continue;
			System.out.println(i);
			
		}*/
		
	
		
		int i = 0;
		externo: //etiquetas
		for (; true ;)
		{	interno: //etiquetas
			for (; i<10; i++) {
				visualizar("i = "+ i);
				if (i == 2) {
					visualizar("continuar");
				continue; }
				if (i == 3) {
					visualizar("salir");
				i++;
				break; 	}
				if(i == 7) {
					visualizar("continuar for externo");
					i++;
				continue externo; 	}
				if(i == 8) {
					visualizar("salir externo");
					break externo;		}
				for(int k = 0; k<5;k++) {
					if (k == 3) {
						System.out.print("continuar interno");
						continue interno;
					}
				}
				
			}
		}
		}
		static void visualizar(String s) {
			System.out.println(s);
		}
		
	
		  
}
