package empresa;

public  class GestionTrabajo {
	static void tratarEmpleado(Empleado emple) {
		System.out.println((emple.getClass().getSimpleName()));
		emple.trabajar();
		if(emple.getClass()==Ingeniero.class) {			
			Ingeniero ing= (Ingeniero) emple;
			ing.disenyar();
		}
			
		
	}

}
