package unidad4;

//E significa que el tipo de dato va a ser generico
public interface Stack<E> {
	
	//tamño de elmentos del stack
	int size();
	
	//si esta vacia
	boolean isEmpty();
	
	//insertar datos
	void push(E e);
	
	//remover datos 
	E pop();
	
	//ultimo elemtno de la stack
	E top();

}
