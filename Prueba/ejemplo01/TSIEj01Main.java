package tsi.s1.ejemplo01;

public class TSIEj01Main {

	public static void main(String[] args) {
		Persona p1 = new Persona(12345, "Carlos", "Reyes", "carlosservian09@gmail.com");
		System.out.println("Nombre y Apellido: "+p1.getNombre()+p1.getApellido());
		
		Alumno al1 = new Alumno (12345, "Carlos", "Reyes", "carlosservian09@gmail.com", "sumatricula");
		System.out.println("Alumno, Nombre y apellido: "+al1.getNombre()+" "+al1.getApellido()+" ");
		
		Integer edad = 20;
		Boolean esm = edad>18;
		if (esm) {
			System.out.println("Es mayor de edad");
		}
		else {
			System.out.println("No es mayor de edad");
		}
		
		System.out.println("Lo haces bien carlitos");
	}

}
