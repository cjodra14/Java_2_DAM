package procesos;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class EjecutarEnTiempoEjecucion {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//Ejemeplo de la API JAva reflection
		//prueba.Pizarra
		//pintar
		//hola
		String nombreClase= args[0];
		String nombreMetodo = args[1];
		String valorMetodo = args[2];
		Class miClase = Class.forName(nombreClase);
		Object miObjeto = miClase.newInstance();
		Method miMetodo = miClase.getDeclaredMethod(nombreMetodo, String.class);
		miMetodo.invoke(miObjeto, valorMetodo);
		
		

	}

}
