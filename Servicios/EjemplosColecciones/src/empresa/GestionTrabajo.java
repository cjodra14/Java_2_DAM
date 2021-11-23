package empresa;

public class GestionTrabajo {

	public static void tratarEmpleado(Empleado empleado) {
		if (empleado instanceof Administrativo) {
			empleado.trabajar();
		} else if (empleado instanceof Tecnico) {
			empleado.trabajar();
		} else if (empleado instanceof Ingeniero) {
			empleado.trabajar();
			Ingeniero ingeniero = (Ingeniero) empleado;
			ingeniero.disenyar();
		}
	}
}
