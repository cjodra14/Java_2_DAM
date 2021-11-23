package empresa;

public class Administrativo extends Empleado implements ManejarOrdenador {
	
	
	Administrativo(String nombre, String apellido, int edad, Dni dni,double sueldo){
		super(nombre,apellido,edad,dni,sueldo);
	}
	Administrativo(){
		super();
	}

	@Override
	void trabajar() {
		// TODO Auto-generated method stub
		System.out.println(nombre+" trabaja");
		
	}

	@Override
	public void teclear() {
		// TODO Auto-generated method stub

		System.out.println(nombre+" teclea");
		
	}

}
