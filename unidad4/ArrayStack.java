package unidad4;

public class ArrayStack<E> implements Stack<E> {
	//tamaño de pila
	public static final int CAPACITY = 1000;
	//declarar mi array generica 
	public E[] data;
	//declar el valor del indice de elementos de mi stack
	private int t = -1;
	//constructores
	public ArrayStack() {
		this(CAPACITY);
	}
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		data = (E[]) new Object[capacity];
	}
	
	//implementamos los metodos
	@Override
	public int size() {
		return (t+1);
	}

	@Override
	public boolean isEmpty() {
		return (t==-1);
	}

	@Override
	public void push(E e) {
		if (size()== data.length) 
				throw new IllegalStateException("stack is full");
		data[++t]=e; //incrmentamos el tamño y el dato de la stack
		
	}

	@Override
	public E pop() {
		if (isEmpty()) return null;
		E answer = data[t];
		data[t] = null; //borrar dato 
		t--;//disminuy mi stack
		return answer;
	}

	@Override
	public E top() {
		if (isEmpty()) return null;
		return data[t];
	}

}
