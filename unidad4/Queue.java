package unidad4;

public interface Queue <E> {
	//metodo tamaño de la cola
	int size();
	//si esta vacia
	boolean isEmpty();
	//insetar elemento
	void enqueue(E e);
	//retornar el primer valor
	E first();
	//remover y retornar el primer elemento
	E dequeue();
}
