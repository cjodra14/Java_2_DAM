package clasesContenedor;

public class Autor {
	private String cod_autor;
	private String nombre_autor;
	private String p_apellido;
	private String s_apellido;
	
	public Autor() {
	}

	public Autor(String cod_autor, String nombre_autor) {
		this.cod_autor = cod_autor;
		this.nombre_autor = nombre_autor;
	}
	

	public Autor(String cod_autor, String nombre_autor, String p_apellido) {
		super();
		this.cod_autor = cod_autor;
		this.nombre_autor = nombre_autor;
		this.p_apellido = p_apellido;
	}

	public Autor(String cod_autor, String nombre_autor, String p_apellido, String s_apellido) {
		super();
		this.cod_autor = cod_autor;
		this.nombre_autor = nombre_autor;
		this.p_apellido = p_apellido;
		this.s_apellido = s_apellido;
	}

	public String getCod_autor() {
		return cod_autor;
	}

	public void setCod_autor(String cod_autor) {
		this.cod_autor = cod_autor;
	}

	public String getNombre_autor() {
		return nombre_autor;
	}

	public void setNombre_autor(String nombre_autor) {
		this.nombre_autor = nombre_autor;
	}

	public String getP_apellido() {
		return p_apellido;
	}

	public void setP_apellido(String p_apellido) {
		this.p_apellido = p_apellido;
	}

	public String getS_apellido() {
		return s_apellido;
	}

	public void setS_apellido(String s_apellido) {
		this.s_apellido = s_apellido;
	}
	

}
