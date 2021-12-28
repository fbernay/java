package clase_05;

import java.util.Arrays;
import java.util.Scanner;

public class Clase_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] numeros =	pedirValoresTeclado();
//	ordenarArray(numeros);
	mostrarArray(numeros);
	promediarValoresArray(numeros);
	calcularMayorYMenor(numeros);
	cargarYMostrarParesImpares();
		
	}
	
	public static int[] pedirValoresTeclado() {
		Scanner teclado = new Scanner(System.in);
		int[] array = new int [10];
		
		for (int i = 9; i >= 0; i--) {
//			System.out.println("Ingrese valor del indice "+i);
//			array[i] = teclado.nextInt();
			array[i]=i+3;
		}
		return array;
	}
	
	
	public static void mostrarArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print(numeros[i]+" ");
		}
	}
	
	
	
	public static int[] ordenarArray(int[] array) {
		Arrays.sort(array);
		return array;
	}
	
	
	public static double promediarValoresArray(int[] array)
	{
		double suma=0;
		double promedio = 0;
		
		for (int i = 0; i < array.length; i++) {
			suma +=array[i];
		}
		promedio= suma/array.length;
		System.out.println("promedio: "+promedio);
		return promedio;
	}
	
	public static void calcularMayorYMenor(int[] array)
	{
		double mayor=array[0];
		double menor = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
		if(array[i]>=mayor)
			mayor=array[i];
		
		if(array[i]<=menor)
			menor=array[i];
		
		
		}
		System.out.println("mayor: "+mayor);

		System.out.println("menor: "+menor);
			}
	
	
	public static void cargarYMostrarParesImpares() {
		Scanner teclado = new Scanner(System.in);
		int[] array = new int [10];
		int pares=0;
		int impares=0;
		int dos=0;
		
		for (int i = 9; i >= 0; i--) {
			System.out.println("Ingrese valor del indice "+i);
			array[i] = teclado.nextInt();
//			array[i]=i+3;
			if(array[i]%2==0)
				pares++;
			else impares++;
			if (array[i]==2)
				dos++;
		}
		System.out.println("pares: "+pares);
		System.out.println("impares: "+impares);
		System.out.println("cantidad de 2: "+dos);
	}
	
	

}
