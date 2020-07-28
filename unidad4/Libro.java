package unidad4;

public class Libro {
	
	private String titulo;
	private String autor;
	
	//constructor 1 vacio
	public Libro() {
		this.titulo = "";
		this.autor = "";
	}
	
	//constructor 2 parametros
	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	//metodo adicional que toda clase debe tener toSTring
	
	public String toString() {
		return (titulo + " " + autor);
	}
	
	
	
	
	
	
	

}
