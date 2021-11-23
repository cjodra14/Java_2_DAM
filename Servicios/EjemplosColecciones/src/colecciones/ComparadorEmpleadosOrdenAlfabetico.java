package colecciones;

import java.util.Comparator;

import empresa.Empleado;

public class ComparadorEmpleadosOrdenAlfabetico implements Comparator<Empleado> {

	public int compareOLD(Empleado empleado1, Empleado empleado2) {
		String nombreCompleto1 = empleado1.getApellido() + " " + empleado1.getNombre();
		String nombreCompleto2 = empleado2.getApellido() + " " + empleado2.getNombre();
		return nombreCompleto1.compareTo(nombreCompleto2);
	}

	@Override
	public int compare(Empleado empleado1, Empleado empleado2) {
		int compararApellidos = empleado1.getApellido().compareTo(empleado2.getApellido());
		if (compararApellidos == 0) {
			int compararNombres = empleado1.getNombre().compareTo(empleado2.getNombre());
			return compararNombres;
		} else {
			return compararApellidos;
		}
	}
	
	
	
	
	

}
