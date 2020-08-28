package unidad6;

import java.util.ArrayList;
import java.util.Iterator;

public class AppPerson {

	public static void main(String[] args) {
		
		//menu con un switch y llamar a cada metodo
		
		//switch 
	//	case 1:
		PersonQueries queries = new PersonQueries();
		
		ArrayList<Person> person = (ArrayList<Person>)queries.getAllPeople();
		
		Iterator<Person> mostrar = person.iterator();
		
		while(mostrar.hasNext()) {
			String obj = mostrar.next().datos();
			System.out.println(obj);
		}
		

	}

}
