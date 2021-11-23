package ejemploMVC;

import java.sql.*;

public class ControladorMVC {
	
	private ModeloMVC modelo;
	private ResultSet resultado;
	

	public ControladorMVC(ModeloMVC modelo) {
		
		this.modelo=modelo;
		
	}
	
	public ResultSet obtenerAutores() {
		resultado= modelo.obtenerAutores();
		return resultado;
	}
	
	public void terminar() {
		modelo.terminar();
	}
	
}
