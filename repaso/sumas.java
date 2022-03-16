package repaso;
import java.util.Scanner;

public class sumas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Float numero;
		
		System.out.println("Digite un numero: ");
		numero = entrada.nextFloat();
		System.out.println("el numero es: "+numero);
		Boolean esma= numero>20;
		if(esma) {
			System.out.println("El numero "+numero+" es mayor que 20");
		} else {
			System.out.println("El numero "+numero+" no es mayor que 20");
		}
		

	}

}
