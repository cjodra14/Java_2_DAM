package ejemploMVC;

import java.sql.*;

public class ModeloMVC {
	
	private Connection conexionBBDD;
	private Statement sentencia;
	private ResultSet resultado;

	public ModeloMVC() {
		try {
			this.conexionBBDD = ServicioMySQL.obtenerServicio().obtenerConexion();
			this.sentencia = this.conexionBBDD.createStatement();
		} catch (SQLException e) {
			System.err.println();
			e.printStackTrace();
		}
	}
	
	
	
	//Libera recursos al terminar
	public void terminar () {
		try {
			if (resultado!= null) resultado.close();
				sentencia.close();
				conexionBBDD.close();
			
		} catch (SQLException e) {
			System.err.println("Modelo: FALLO AL CERRAR LA CONEXIÓN ");
			e.printStackTrace();
		}
	}
	
	
	////////////////////////////////////////////////////////////////////////////////////////////
	// AQUÍ EMPIEZA LA LÓGICA DE NEGOCIO /////////////////////////////////////////
	
	
	public ResultSet obtenerAutores() {
		try {
			String sql = "SELECT * FROM AUTOR ";
			resultado = sentencia.executeQuery(sql);
			
		} catch (SQLException e) {
			System.err.println("Modelo: FALLO A OBTENER  AUTOR");
			e.printStackTrace();
		}
		return resultado;
	}
}


