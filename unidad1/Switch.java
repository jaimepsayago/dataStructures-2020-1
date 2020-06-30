package unidad1;

public class Switch {

	public static void main(String[] args) {
		// ejemplo de letras azar y si son consonantes o vocales
		//a traves dle switch y combinado con otras edd basicas
		
	for(int i=0; i<100; i++) {
		char c = (char)(Math.random()*26+'a');
		System.out.print(c + ": ");
		
		//switch
		//c es el valor de entrada c = a b c d e f g h i 
		switch(c) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.println("vocal");
		break;
		case 'y':
			System.out.println("esta es una y");
			break;
		case 'w':
			System.out.println("esta es una w");
			break;
		default:
			System.out.println("consonante");
		
			
		}}}

}
