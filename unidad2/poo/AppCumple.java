package unidad2.poo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppCumple {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//crear objeto
		DyaAnio hoy;
		DyaAnio cumpleanios;
		//variables en la aplicacion
		int d, m;
		//entrada de datos
		BufferedReader entrada = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.print("introduzca fecha de hoy, dia: ");
		d = Integer.parseInt(entrada.readLine());
		
		System.out.print("introduzca el mes: ");
		m = Integer.parseInt(entrada.readLine());
		
		//instancio objetos
		//hoy es el objeto1
		hoy = new DyaAnio(d, m);
		
		System.out.print("introduzca fecha de nacimiento, dia: ");
		d = Integer.parseInt(entrada.readLine());
		
		System.out.print("introduzca el mes nacimiento: ");
		m = Integer.parseInt(entrada.readLine());
		//cumpleanios es el objeto2
		cumpleanios = new DyaAnio(d,m);
		
		System.out.print("fecha de hoy es: ");
		hoy.visualizar();
		
		System.out.print("fecha de cumpleaños es: ");
		cumpleanios.visualizar();
		
		//mensaje de cumpleaños 
		if (hoy.igual(cumpleanios)) {
			System.out.println("feliz cumpleaños");
		}else {
			System.out.println("feliz dia");
		}
			
		//polimorfismo
		DyaAnio operacion = new DyaAnio();
		System.out.println(operacion.suma(2, 1));
		System.out.println(operacion.suma(2, 4));
		
		double[] array = new double[3];
		array[0] = 22;
		array[1] = 23;
		array[2] = 24;
		System.out.println(operacion.suma(array));
		
		

	}

}
