package conexion;
import java.sql.*;

public class Conexion {

	public static void main(String [] args) {
		
		try {
			
			// Cargar la clase del Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Se ha cargdo el driver JDBC para MySQl correctamenete");
			
			
			//DEfinición datos de conexión
			final String URL;
			URL = "Jdbc:mysql://localhost:3306/libreria";
			String user ="root";
			String pass="romaol2";			
			Connection conexion= DriverManager.getConnection(URL,user,pass);
			System.out.println("Conexión con la Base de Datos \' libreria \' - OK");
			
			//Definición del Statement
			String sql = "SELECT * FROM autor";
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			// Procesamos los datos
			
			while(rs.next()) {
				String codigo_autor = rs.getString(1);
				String nombre_autor = rs.getString(2);
				String p_apel_autor = rs.getString(3);
				String s_apel_autor = rs.getString(4);
				
				System.out.print("Código: "+ codigo_autor+", Nombre: "+nombre_autor);
				if(p_apel_autor!=null)System.out.print(", "+p_apel_autor);
				if(s_apel_autor!=null)System.out.print(" "+s_apel_autor);
				System.out.println();
			}
			
			
			// Recursos cerrados
			rs.close();
			stmt.close();
			conexion.close();
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Hay un error en la conexion");
			e.printStackTrace();
		}
	}
}
