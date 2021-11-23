package empresa;

public class Tecnico  extends Empleado implements Arreglador{
	
	Tecnico(String nombre, String apellido, int edad, Dni dni,double sueldo){
		super(nombre,apellido,edad,dni,sueldo);		
	}
	Tecnico(){
		super();
	}

	@Override
	public void arreglar() {
		// TODO Auto-generated method stub

		System.out.println(nombre+" arregla");
		
	}

	@Override
	void trabajar() {
		// TODO Auto-generated method stub

		System.out.println(nombre+" trabaja");
		
	}

}
