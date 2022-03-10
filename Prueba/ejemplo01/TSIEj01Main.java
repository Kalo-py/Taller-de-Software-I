package tsi.s1.ejemplo01;

public class TSIEj01Main {

	public static void main(String[] args) {
		Persona p1 = new Persona(12345, "Carlos", "Reyes", "carlosservian09@gmail.com");
		System.out.println("Nombre y Apellido: "+p1.getNombre()+p1.getApellido());
	}

}
