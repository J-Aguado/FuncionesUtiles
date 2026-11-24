package numRandom;

public class NumRandom {
	public static void main(String[] args) {
		
	}
	static int generaNummeroAleatorio (int MIN, int MAX) {
		int numero = (int)(Math.random()*(MAX - MIN + 1)) + MIN;
		return numero;
	}

}
