package repaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/**
 * 
 * @author Carlos
 *
 */
public class mainjava {

	public static void main(String[] args) throws IOException{
		InputStreamReader capturar = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(capturar);
		
		System.out.println("Ingrese su edad: ");
		Integer strEdad = buffer.read();
		Integer edad = strEdad;
		if(edad>=18) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}
		Scanner entrada = new Scanner(System.in);
		Float numero;
		System.out.println("Digite un numero: ");
		numero = entrada.nextFloat();
		System.out.println("el numero es: "+numero);

	}

}
