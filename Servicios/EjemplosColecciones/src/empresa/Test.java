package empresa;

public class Test {

	public static void main(String[] args) {

		Dni dni1 = new Dni(78878775, 'E');

		Administrativo administrativo = new Administrativo("iker", "gorrochategui azcarate", 31, dni1, 2000);
		System.out.println(administrativo);
		administrativo.trabajar();

		Dni dni2 = new Dni(12345678, 'J');

		Tecnico tecnico = new Tecnico("pedro", "gorrochategui", 34, dni2, 750);
		System.out.println(tecnico);
		tecnico.trabajar();

		Dni dni3 = new Dni(45671234, 'F');

		Ingeniero ingeniero = new Ingeniero("alex", "carrillo", 22, dni3, 2500);
		System.out.println(ingeniero);
		ingeniero.trabajar();
		
		System.out.println("sueldo del administrativo: " + administrativo.obtenerSueldo());
		System.out.println("sueldo del tecnico: " + tecnico.obtenerSueldo());
		System.out.println("sueldo del ingeniero: " + ingeniero.obtenerSueldo());
		
		GestionTrabajo.tratarEmpleado(administrativo);
		GestionTrabajo.tratarEmpleado(tecnico);
		GestionTrabajo.tratarEmpleado(ingeniero);

	}

}
