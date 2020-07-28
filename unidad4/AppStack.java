package unidad4;

import java.util.Stack;

public class AppStack {

	public static void main(String[] args) {

		/*Stack<Integer> s = new ArrayStack<>();
		s.push(5);
		s.push(3);
		System.out.println(s.size());
		System.out.println(s.top());
		System.out.println(s.isEmpty());
		System.out.println(s.pop());*/
		
		//pilas con la clase java
		
		//objeto stack de la libreria java
		
		//instancia de objeto stack
		java.util.Stack pila = new java.util.Stack();
		
		pila.push(50);
		pila.push(60);
		pila.push("strings palabras");
		
		while(pila.empty()== false) {
			System.out.println(pila.pop());
		}
		
		
		//pila de objetos
		Stack<Libro> pilaObjeto = new Stack<Libro>();
		
		//instanciar objetos
		Libro l1 = new Libro("titulo 1", "autor 1");
		Libro l2 = new Libro("titulo 2", "autor 2");
		Libro l3 = new Libro("titulo 3", "autor 3");
		
		pilaObjeto.push(l1);
		pilaObjeto.push(l2);
		pilaObjeto.push(l3);
		
		//elemento ultimo
		
		System.out.println(pilaObjeto.peek().getAutor());
		
		while(!pilaObjeto.isEmpty()) {
			System.out.println(pilaObjeto.pop().toString());
		}
		
		
	}

}
