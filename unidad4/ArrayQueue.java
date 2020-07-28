package unidad4;

public class ArrayQueue <E> implements Queue<E> {

	//variables
	private E[] data; //datos
	private int f =0; //index
	private int sz = 0;//numero de elementos;
	public static final int CAPACITY = 1000;
	
	//constructor	
	public ArrayQueue() {
		this(CAPACITY); //tamaño por defecto
	}
	public ArrayQueue(int capacity) {
		data = (E[]) new Object[capacity];//tamaño declarado por el usuario
	}

	@Override
	//numero de elementos
	public int size() {
		return sz;
	}

	@Override
	//si esta vacia
	public boolean isEmpty() {
		return (sz == 0);
	}

	@Override
	//inserta un elemento
	public void enqueue(E e) {
		if (sz == data.length) throw new IllegalStateException("cola esta llena");
		int avail = (f + sz) % data.length;
		data[avail] = e;
		sz++;
	}

	@Override
	//retorna el valor pero no lo remueve
	public E first() {
		if (isEmpty()) return null;
		return data[f];
	}

	@Override
	//retorna y remueve el elemento
	public E dequeue() {
		if(isEmpty()) return null;
		E res = data[f]; //insertar el objeto en una variable res
		data[f] = null; //referencia el objeto a colector de garbage 
		f = (f+1) % data.length;//reobteniendo el tamaño del objeto
		sz--;//disminur el tamño del objeto
		return res;
		
						
	}

}
