package dao;

import java.sql.*;
import java.util.*;

public class DAOAutor {

	//INICIO DEL BEAN
	private int codAutor;
	private String nombreAutor;
	
	public DAOAutor(String nombreAutor) {
		setNombreAutor(nombreAutor);
	}
	
	public void setCodAutor(int codAutor) {
		this.codAutor = codAutor;
	}
	
	public int getCodAutor() {
		return this.codAutor;
	}
	
	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}
	
	public String getNombreAutor() {
		return this.nombreAutor;
	}
	//FIN BEAN
	
	//INTEGRACI�N CON LA BBDD
	//La clase DAO debe tener conexi�n con la BBDD para conectarse con su tabla
	private static Statement sentencia;
	private static ResultSet resultado;
	private int retorno;
	
	public static void setConexionBBDD(Statement sentencia, ResultSet resultado) {
		DAOAutor.sentencia = sentencia;
		DAOAutor.resultado = resultado;
	}
	//M�TODOS CRUD
	//READ
	//M�todo que extrae todos los registros de la tabla
	public static Vector<DAOAutor> obtenerAutores() throws SQLException{
		String sqlQuery = "select * from autor";
		//Este m�todo devolver� un vector de tipo <AutorDAO>
		return buscaResultadosConConsulta(sqlQuery);	
	}
	//FIN METODOS CRUD
	
	//M�TODOS UTILITY DE CLASE
	//M�todo que extrae filas de la tabla a trav�s de una consulta
	private static Vector<DAOAutor> buscaResultadosConConsulta(String consulta) throws SQLException{
		resultado = DAOAutor.sentencia.executeQuery(consulta);
		return cargaResultSetToVector(resultado);
		
	}
	
	private static Vector<DAOAutor> cargaResultSetToVector(ResultSet resultado) throws SQLException {
		Vector<DAOAutor> autores = new Vector<DAOAutor>();
		DAOAutor autor;
		
		while(resultado.next()) {
			int codAutor = resultado.getInt(1);
			String nombreAutor = resultado.getString(2);
			autor = new DAOAutor(nombreAutor);
			autor.setCodAutor(codAutor);
			autores.addElement(autor);
		}
		
		return autores;
	}
	//FIN M�TODOS UTILITY DE CLASE
	
}
