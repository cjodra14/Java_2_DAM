package controlador;

import java.sql.SQLException;
import java.util.Vector;

import modelo.ModeloLibreria;
import dao.DAOAutor;
import dao.DAOlibro_escritor;

public class ControladorAutor {

	private ModeloLibreria modelo;
	private Vector<DAOAutor> autores;
	
	//Constructor
	public ControladorAutor(ModeloLibreria modelo) {
		this.modelo=modelo;
	}
	
	//Este metodo retorna un vector de autores y lo obtiene del metodo obtenerAutores()
	public Vector<DAOAutor> obtenerAutores(){
		autores=modelo.obtenerAutores();
		return autores;
	}
	
	public DAOAutor obtenerAutor(String idAutor) throws SQLException {
		DAOAutor autor;
		autor=modelo.obtenerAutor(idAutor);
		return autor;
	}
	
	//Este m?todo se utiliza para meter datos con la sentencia INSERT
	public void insertarAutor(String idAutor, String nombreAutor, String apel1, String apel2) throws SQLException{
		modelo.insertarAutor(idAutor,nombreAutor,apel1,apel2);
	}
	
	//Este m?todo ejecutar? una sentencia UPDATE para modificar un autor
	public void modificarAutor(String idAutor, String nombreAutor, String apel1, String apel2) throws SQLException{
		modelo.modificarAutor(idAutor,nombreAutor,apel1,apel2);
	}
	
	//Este m?todo ejecutar? una sentencia DELETE para eliminar un autor
	public int borrarAutor(String idAutor) throws SQLException{
		
		 return modelo.borrarAutor(idAutor);
	}
	
	
	

	//Ejecutamos el m?todo terminar para liberar memoria
	public void terminar() {
		modelo.terminar();
	}
}
