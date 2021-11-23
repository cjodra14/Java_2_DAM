package ejemploMVC;

public class MVCApp {


	public static void main(String[] args) {
		ModeloMVC modelo = new ModeloMVC();
		ControladorMVC controlador = new ControladorMVC(modelo);
		VisorMVC visor = new VisorMVC(controlador);
		visor.getAccion();

	}

}
