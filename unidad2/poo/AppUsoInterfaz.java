package unidad2.poo;

public class AppUsoInterfaz {

	public static void main(String[] args) {

		Persona p = new Persona();
		Canario c = new Canario();
		c.cantar();
		hacerCantar(p);

	}
	//metodos staticos
	public static void hacerCantar(Cantante c) {
		c.cantar();

	}
	

}
