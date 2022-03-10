package tsi.s1.ejemplo01;

public class Persona {
//	atributos de la clase
	private Integer ci;
	private String nombre, apellido, email;

	/**
	 * Constructor por defecto
	 */
	public Persona() {
	}
	/**
	 * Constructor parametrizado, requiere todos los atributos 
	 * @param ci
	 * @param nombre
	 * @param apellido
	 * @param email
	 */
	public Persona(Integer ci, String nombre, String apellido, String email) {
		this.ci = ci;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	/**
	 * Metodo get para el atributo CI
	 * @return Integer
	 */
	public Integer getCi() {
		return ci;
	}

	public void setCi(Integer ci) {
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
