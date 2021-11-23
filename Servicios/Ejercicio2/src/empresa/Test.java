package empresa;

public class Test {

	public static void main(String[] args) {
		Administrativo admin1 = new Administrativo("Jose","Lopez",45,new Dni(12345678,'c'),1500d);
		admin1.trabajar();
		Tecnico tec1 = new Tecnico("Pedro","Perez",33,new Dni(87654321,'k'),1250d);
		tec1.trabajar();
		Ingeniero ing1 = new Ingeniero("Juan","jimenez",57,new Dni(18273645,'u'),3469d);
		ing1.trabajar();
		System.out.println(admin1.obtenerSueldo());
		System.out.println(tec1.obtenerSueldo());
		System.out.println(ing1.obtenerSueldo());
		GestionTrabajo.tratarEmpleado(admin1);
		GestionTrabajo.tratarEmpleado(tec1);
		GestionTrabajo.tratarEmpleado(ing1);
	}

}
