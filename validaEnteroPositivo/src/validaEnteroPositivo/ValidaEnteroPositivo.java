package validaEnteroPositivo;

import java.util.Scanner;

public class ValidaEnteroPositivo {
	public static void main(String[] args) {
		
	}
	
	static int validaEnteroPositivo (Scanner sc) {
		int numValidado = 0;
		do {
			System.out.println("Introduce un numero entero positivo");
			numValidado = sc.nextInt();
		} while (numValidado <= 0);
		return numValidado;
	}

}
