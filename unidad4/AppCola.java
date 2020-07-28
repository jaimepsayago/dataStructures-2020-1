package unidad4;

import java.util.Iterator;
import java.util.LinkedList;

public class AppCola {

	public static void main(String[] args) {
		/*Queue<Integer> s = new ArrayQueue<>();
		s.enqueue(8);
		s.enqueue(16);
		
		System.out.println(s.first());
		
		while(!s.isEmpty()) {
			System.out.println(s.dequeue());
		}*/
		
		//cola libreria de java LinkedList
		LinkedList<String> list = new LinkedList<String>();
		
		//agregar
		list.add("juan");
		list.add("luis");
		list.add("manuel");
		
		list.addFirst("Pedro");
		list.addLast("jose");
		
		//agregar datos por posicion ?=3
		list.add(2, "Glenn");
		
		list.remove(3);
		
		//obetner un dato y agregarlo
		//obetener dato
		Object datoObtenido = list.get(0);
	System.out.println("dato en posicion (0) cero " + datoObtenido);
	
		//agregar un dato
	list.set(0,"cambio de Pedro");
	
		//mostrar la lista
		Iterator<String> iterator= list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Libro l1 = new Libro("titulo 1", "autor 1");
		Libro l2 = new Libro("titulo 2", "autor 2");
		Libro l3 = new Libro("titulo 3", "autor 3");
		
		
		//insertar en la cola con linkelist y recorrerlos
		
		

	}

}
