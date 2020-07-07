package unidad1.ejercicioPractico;

public class LibroCalificaciones {

	//propiedades
	
	private String nombreDelCurso;
	private int calificaciones [][];
	
	

	
	//constructor
	public LibroCalificaciones(String nombreDelCurso, int calificaciones[][]) {
		this.nombreDelCurso=nombreDelCurso;
		this.calificaciones= calificaciones;
		
	}
	//metodos
	//metodo para nombre del curso
	public void establecerNombreCurso(String nombre) {
		nombreDelCurso = nombre;
	}
	
	public String obtenerNombreCurso() {
		return nombreDelCurso;
	}
	
	//mostrar mensaje
	public void mostrarMensaje() {
		System.out.println("bienvenido al curso: " + obtenerNombreCurso());
	}
	
	//procesar las calificaciones
	public void procesarCalificaciones() {
		//llamar a metodos obtenerminimos y obtenermaximos
		//graficos
		
		//imprimir calificaciones
		imprimirCalificaciones();
		System.out.println(obtenerMinima());
		System.out.println(obtenerMaxima());
	}
	
	
	public void imprimirCalificaciones() {
		System.out.println("estas son las calificaciones");
		
		//encabezada y columnas
		for ( int prueba = 0; prueba < calificaciones[0].length; prueba++) {
			System.out.printf("prueba %d", prueba + 1);
		}
		System.out.println("promedio");
		
		
		//crear filas y colummas con texto de calificaciones
		for (int estudiante = 0; estudiante < calificaciones.length;estudiante++) 
		{
			System.out.printf("estudiante %2d", estudiante+1);
			for(int prueba:calificaciones[estudiante])
				System.out.printf("%8d", prueba);
			System.out.println();
		}
		
	}

	public int obtenerMinima() {
		int caliBaja = calificaciones[0][0];
		for(int califica[]: calificaciones) {
			for(int calificacion:califica) {
				if (calificacion< caliBaja)
					caliBaja=calificacion;
			}
		}
		return caliBaja;	
	}
	
	public int obtenerMaxima() {
		int caliAlta = calificaciones[0][0];
		for(int califica[]: calificaciones) {
			for(int calificacion:califica) {
				if (calificacion> caliAlta)
					caliAlta=calificacion;
			}
		}
		return caliAlta;	
	}

}
