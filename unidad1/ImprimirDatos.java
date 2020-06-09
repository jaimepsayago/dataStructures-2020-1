package unidad1; //carpeta contenedora

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/*varias lineas
 * de comentarios
 */

public class ImprimirDatos {

	public static void main(String[] args) {
	/*	System.out.println("Bienvenido a Java!!!");
		
		//printf
		System.out.printf("%s \n %s \n ","Bienvenido a",
				"a Java!!!");
		//ENTRADA / SALIDA
		//ingreso y salida de datos
		//ingreso datos
		Scanner input = new Scanner(System.in);
		//mensaje de ingreso de datos
		System.out.println("inserte texto: ");
		//variable para almacenar los datos ingresados
		String texto = input.nextLine();
		//mostrar el dato ingresado
		System.out.println(texto);
			 
		
		System.out.println("inserte texto2: ");
		String texto2 = input.nextLine();
		System.out.println(texto2);
		
		//variables
		//declararlas
		
		int dias, d, c=0, e=1, f;
		Integer dias1;
		
		int dias2 = 365; //inicializando la variable
		
		int suma = 0; //inicializar con algun valor la variable
		
		//ambito de las variables
		
		//depende si son locales o globales
		
		//tip es mejor utilizar con un nombre especifico
		
		//PRECEDENCIA DE OPERADORES
		// * / % + - 
		
		//m = (a + b + c) / 5;
		
		//operadores de igualdad y relacionales
		
		/*igual ==
		no es igual !=
		
		operadores relacionales
		<
		>
		<=
		>=
		
		x = a * -b;
		x = a * (-b);
		
		
		
		------FORMATOS DE SALIDA
		
		printf 
		format

		12.3685 es numero con dos decimales
		
		
		

		
		double a = 12.3685;
		
		System.out.printf("%.2f %n", a);
		
		System.out.printf("%.3f %n", a);
		
		
		\n
		
		*/
		
		//String cadena = "esta es una cadena";
		//System.out.printf("%s \n ", cadena);
		
		/*
		double q = 1.0/3.0;
		
		System.out.printf ("1.0/3.0 = %5.3f %n", q);
		
		System.out.printf ("1.0/3.0 = %7.5f %n", q);
		
		q = 1.0/2.0;
		System.out.printf ("1.0/2.0 = %09.3f %n", q);
		q = 1000.0/3.0;
		System.out.printf ("1000/3.0 = %7.1e h%n", q);
		q = 3.0/4567.0;
		System.out.printf ("3.0/4567.0 = %7.3e %n", q);
		q = -1.0/0.0;
		System.out.printf ("-1.0/0.0 = %7.2e %n", q);
		q = 0.0/0.0;
		System.out.printf ("0.0/0.0 = %5.2e %n", q);
		
	
		
		
	//FECHAS
		Calendar fechaHora = Calendar.getInstance();
		System.out.printf("%tc \n", fechaHora);
		System.out.printf("%tF \n", fechaHora);
		System.out.printf("%tD \n", fechaHora);
		System.out.printf("%tr", fechaHora);
		
	*/
		
	//	EJEMPLO DE OPERADORES LOGICOS
		
	/*Random aleatorio = new Random();
	
	int i = aleatorio.nextInt() % 100;
	int j = aleatorio.nextInt() % 100;
		
	System.out.println("i = " + i);
	System.out.println("j = " + j);
		
	System.out.println("i >= j = "+ (i>=j));
	System.out.println("i <= j = "+ (i<=j));	
	
	System.out.println("i >= j = "+ (i>=j));
	System.out.println("i <= j = "+ (i<=j));	
	
	System.out.println("i == j = "+ (i == j));
	System.out.println("i != j = "+ (i != j));	
	
	System.out.println("i < 10 && j < 10 es "
	+ (i < 10 && j < 10));	
	

		//IF
		// if (expresión condicional)
		//{}
		
		// sentencia
		//else 
		//sentencia
		
		int intento = 10, solucion = 10;
		int resultado = 0;
		
		if ( intento> solucion) {
			resultado = +1;
		}
		else if (intento < solucion)
			resultado = -1;
		else 
			resultado = 0;
		
		System.out.println(resultado);
		

		//Operadores
		 int i =1;
		 System.out.println("i : "+i);
		 
		 System.out.println("i : "+ ++i);
		 System.out.println("i : "+ i++);
		 
		 System.out.println("i : "+i);
		
		 System.out.println("i : "+ --i);
		 System.out.println("i : "+ i--);
		
		 System.out.println("i : "+i);
		
				
*/
		
		//COMPARACIONES
		
		//Integer n1 = 47, n2=47;
		
	//	System.out.println(n1 == n2);
		//System.out.println(n1 != n2);
		
		//System.out.println(n1.equals(n2));
		
		
		//CONVERSION DE DATOS O CAST
	/*	Integer a =2;
		int a1 = 2;
		double b=3.0;
		float c = (float)(20000*a/b+5);
		
		System.out.println("valor en formato float:" + c);
		System.out.println("valor en formato double:" + (double)c);
		System.out.println("valor en formato short:" + (short)c);
		
		long l = (long)c;
		System.out.println("valor en formato long:" + l);
		
		//a string toString, 
		//parseInt, parseFloat,
		//doubleValue, intValue de tipo obj a primitivo
		
		System.out.println(Integer.toString(55,2));
		int x = Integer.parseInt("75");
		System.out.println(x);
		Double y = Double.valueOf("3.14").doubleValue();
		System.out.println(y);
		//string a integer
		
		String cadena="8989";
		try {
			//Integer entero = Integer.parseInt(cadena);
			//System.out.println(entero);
			
			//char a string
			char codigo = 'A';
			String cadena1 = Character.toString(codigo);
			System.out.println(cadena1);
			
			//string a double
			double d = Double.parseDouble(cadena);
			System.out.println(d);
		}
		catch (Exception e) {
			System.out.println("error "+ e.getMessage());
		}
		
		*/
		
		//FUNCIONES
		
		/*nombre_funcion ( argumento "tipo y nombre"){
			bloque de sentencias
		}*/
		
		int x, y;
		x = 12;
		y = 43;
		
		int sumatotal = suma(x,y);
		System.out.println("la suma es :" + sumatotal);
		
		int a = 5;
		if (par(a)== true) {
			System.out.println(a + "es par");
		}else
			System.out.println(a + "es impar");
		//volumen radio
		Scanner entrada = new Scanner(System.in);
		System.out.print("escriba el radio de la esfera: ");
		double radio = entrada.nextDouble();
		System.out.println("el volumen de la esfera es: " + 
		volumenEsfera(radio));
}		
	//fuera del public static void main
	static int suma(int x, int y){
		int s;
		s = x + y;
		return s;
	}
	//otras funciones
	static boolean par(int a) {
		boolean p = false;
			if(a % 2 == 0) {
				p = true;
			}
		return p;
	}
	//otra funcion
	static double volumenEsfera(double radio) {
		double volumen = (4.0*3.0)*Math.PI*Math.pow(radio, 3);
		return volumen;
	}
	
	
}
