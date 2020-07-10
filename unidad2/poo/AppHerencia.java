package unidad2.poo;

public class AppHerencia {

	public static void main(String[] args) {

	Humano h = new Humano("juan", "perez");
	Ciudadano b = new Ciudadano("juan", "Perez", "0302121");
	
	//crear un arreglo de objetos
	Humano [] arrayHumano = new Humano[2];
	
	arrayHumano[0] = h;
	arrayHumano[1] = b;
	 
	polimorfico(arrayHumano);

	}
	
	//recorrer el aarray de objeto con funcion
	static void polimorfico(Humano [] arregloH) {
		for (int i = 0; i<arregloH.length;i++) {
			System.out.println("identificador: " + arregloH[i].identificacion());
		}
	}

}
