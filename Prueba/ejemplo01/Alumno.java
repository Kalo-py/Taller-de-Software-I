package tsi.s1.ejemplo01;

public class Alumno extends Persona {
	private String matricula;

	public Alumno() {
		super();
	}

	public Alumno(Integer ci, String nombre, String apellido, String email, String matricula) {
		super(ci, nombre, apellido, email);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
