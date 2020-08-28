package unidad6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//preparar la conexion a la base datos
//las consultas para el manejo de los datos
//los metodos para la aplicacion
public class PersonQueries {
	//conexion
	//jdbc java database conection/ es una libreria para conexion a base de datos
	
	//configuracion de varialbes conexion
	private static final String URL = "jdbc:postgresql://localhost/ejemplo";
	private static final String username = "postgres";
	private static final String password = "postgres";
	
	private Connection connection = null; //manejar mi conexion
	//instanciar consultas
	private PreparedStatement selectAllPeople = null;
	private PreparedStatement selectPeopleByLastName = null;
	private PreparedStatement insertNewPerson = null;
	
	//constructor
	public PersonQueries() {
		try {
			//implementar conexion
			connection = DriverManager.getConnection(URL,username,password);
			
			//implementar consultas
			selectAllPeople =
			connection.prepareStatement("select * from Addresses");
			
			//selecionar por apellido 
			selectPeopleByLastName=
					connection.prepareStatement("select * from Addresses where LastName = ?");
			
			//insertar persona
			insertNewPerson =
					connection.prepareStatement(
							"insert into Addresses " +
								"(FirstName, LastName, Email, PhoneNumber )"+
									"values (?, ?, ?, ?)");
	
			
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			System.exit(1);
		}
	}
	
	//metodos en java para la utilizacion de estas consultas
	
	//listar 
	public List<Person> getAllPeople(){
		
		List<Person> result = null; //lista donde contendra la información resultante de la consulta
		ResultSet resultset= null; //dataset donde se carga la consulta selectAllPeople
		
		try {
			resultset = selectAllPeople.executeQuery();
			result = new ArrayList<Person>();
			
			//llenar datos
			while (resultset.next()) {
				result.add(new Person(
					resultset.getInt("addressid"),
					resultset.getString("firstname"),
					resultset.getString("lastname"),
					resultset.getString("email"),
					resultset.getString("phonenumber")	));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				resultset.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
				close();
			}
		}
		return result;
	}
	
	
	
//agregar datos
	public int addPerson(String fname, String lname, String email, String num) {
		int result = 0;
		//settear parametros para insetar persona
		
		try {
			insertNewPerson.setString(1, fname);
			insertNewPerson.setString(2, lname);
			insertNewPerson.setString(3, email);
			insertNewPerson.setString(4, num);
		
		//ejecutamos la consulta o querie
		result = insertNewPerson.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			close();
		}
	return result;	
		
	}
	
	
	
	public List<Person> getPeopleByLastName(String name){
		List<Person> result = null; //lista donde contendra la información resultante de la consulta
		ResultSet resultset= null; //dataset donde se carga la consulta selectAllPeople
		
		try {
			selectPeopleByLastName.setString(1, name); //envio de parametro
			resultset = selectPeopleByLastName.executeQuery();
			result = new ArrayList<Person>();
			
			//llenar datos
			while (resultset.next()) {
				result.add(new Person(
					resultset.getInt("addressid"),
					resultset.getString("firstname"),
					resultset.getString("lastname"),
					resultset.getString("email"),
					resultset.getString("phonenumber")	));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				resultset.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
				close();
			}
		}
		return result;
	}
	
	
	public void close() {
		try {
			connection.close();
		} catch ( SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
