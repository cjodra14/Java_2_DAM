package ejemploMVC;

import java.sql.*;

public class ServicioMySQL {

	private static ServicioMySQL servicio;
	private Connection conexion;
	
	private ServicioMySQL() {
		try {
			//Cargar el driver para MySQL
			Class.forName("com.mysql.jdbc.Driver");
			
			//Datos para la conexi�n
			final String URL;
			URL = "jdbc:mysql://localhost:3306/libreria?useSSL=false"; // useSSL=false es para quitar la primera linea verde
			String user ="root";
			String pass="romaol2";			
			
			//Establecimiento  de la conexi�n con la BBDD
			conexion= DriverManager.getConnection(URL,user,pass);
			
		} catch (ClassNotFoundException e) {
			System.err.println("ServicioMySQL: Driver de la BBDD no cargado");
			e.printStackTrace();
		}
		catch (SQLException e) {
			System.err.println("ServicioMySQL: Fallo al establecer la conexi�n");
			e.printStackTrace();
		}
	}
	
	
	
	
	//Este metodo crea el servicio para la BBDD
	public static synchronized ServicioMySQL obtenerServicio() {
		if (servicio==null) {
			servicio =  new ServicioMySQL();
		}
		return servicio;
	}
	
	//Este metodo proporciona a conexi�n creada
	public Connection obtenerConexion() {
		return conexion;
	}
}
