package maxValorArray;

public class MaxValorArray {
	
	public static void main(String[] args) {
		
	}
	
	//Funcion que recibe una array de tipo int y devuelve su valor maximo
	static int maximoValorArray (int a[]) {
		
		int maximoValor = 0;
		
		for (int num : a) {
			if (num > maximoValor) {
				maximoValor= num;
			}
		}
		
		return maximoValor;
	}
	
	//Funcion que recibe una array de tipo double y devuelve su valor maximo
	static double maximoValorArray (double a[]) {
		
		double maximoValor = 0;
		
		for (double num : a) {
			if (num > maximoValor) {
				maximoValor= num;
			}
		}
		
		return maximoValor;
		
	}

}
