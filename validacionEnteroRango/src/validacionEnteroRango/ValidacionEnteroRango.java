package validacionEnteroRango;

import java.util.Scanner;

public class ValidacionEnteroRango {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		validaEnteroRango(0, 2, sc);
	}
	
	//Valida que el usuario introduce un numero situado dentro del rango (inicio,fin)
	static int validaEnteroRango(int inicio, int fin, Scanner sc) {

		int numValido = 0;
		do {
			System.out.println("Introduce un numero, debe estar situado entre "+inicio+" y "+fin);
			numValido = sc.nextInt();
		} while (numValido < inicio || numValido > fin);
		
		return numValido;
	}

}
