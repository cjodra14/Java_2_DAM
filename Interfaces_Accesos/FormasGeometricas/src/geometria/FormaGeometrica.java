package geometria;

public abstract class FormaGeometrica {
	
	private String nombre;
	
	public FormaGeometrica(String nombre) {
		this.nombre=nombre;
	}
	
	
	protected abstract double calcularArea();
	
	protected abstract double calcularPerimetro();
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}

}
