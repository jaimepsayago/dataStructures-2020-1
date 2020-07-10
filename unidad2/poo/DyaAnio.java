package unidad2.poo;

public class DyaAnio {
	//variables
	private int mes;
	private int dia;
	
	//constructor
		public DyaAnio(int d, int m) {
			dia = d;
			mes = m;
		}
	//constructor vacio para creacion objeto
		public DyaAnio() {
			
		}
		
		//
	//metodo comprobar fechas
	public boolean igual(DyaAnio d) {
		if((dia == d.dia) && (mes== d.mes) )
			return true;
		else
			return false;
	}
	
	//metodo visualizar
	public void visualizar() {
		System.out.println("mes: "+mes+ ", dia: "+ dia);
	}
	
	//polimorfismo
	//sobrecarga de metodos
	//en el cual el mismo metodo puede tener varios 
	//parametros con resultados distintos
	
	//metodo suma 1
	double suma(double x, double y) {
		return x+y;
	}
	//metodo suma 2
	double suma(double x, double y, double z) {
		return x+y+z;
	}
	//metodo suma 3
	double suma(double [] array) {
		double total = 0;
		for (int i = 0; i<array.length;i++) {
			total += array[i];
		}
		return total;
	}
	
	
		
	
}
