package clase_05;

import java.util.Arrays;
import java.util.Scanner;

public class Clase_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] numeros =	pedirValoresTeclado();
	mostrarArray(numeros);
		
	}
	
	public static int[] pedirValoresTeclado() {
		Scanner teclado = new Scanner(System.in);
		int[] array = new int [10];
		
		for (int i = 9; i >= 0; i--) {
//			System.out.println("Ingrese valor del indice "+i);
//			array[i] = teclado.nextInt();
			array[i]=i+1;
		}
		Arrays.sort(array);
		return array;
	}
	
	
	public static void mostrarArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print(numeros[i]+" ");
		}
	}
	
	
	
	
	

}
