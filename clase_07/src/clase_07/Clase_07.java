package clase_07;

import java.util.Arrays;

public class Clase_07 {

	public static void main(String[] args) {
		
		System.out.println("Suma recursiva");
		int resultado= sumaRecursiva(54);
		System.out.println(resultado);
		
		System.out.println("--------------------------------");
		
		System.out.println("Factorial");
		resultado = factorial(4);
		System.out.println(resultado);
		System.out.println("--------------------------------");
		
//		System.out.println("Suma recursiva con array");
//		int[] arreglo= {2,2,2};
//	
//		resultado= sumaArrayRecursiva(arreglo);
//		System.out.println(resultado);
//		
		
		
		

	}
	
	
//	public static int sumaArrayRecursiva(int [] array) {
//		int resultado = 0;
//		
//		int inicio = 0;
//		int fin = array.length-1;	
//		
//		if(fin==0)
//		{
//			resultado = array[0];
//		}
//		else {
//			
//			resultado = array[fin] + sumaArrayRecursiva();
//
//		}
//		
//		
//		
//			
//		return resultado;
//		
//	}
	
	
	
	
	public static int factorial(int numero) {
		int resultado = 0;
		
		if(numero==1) {
		resultado = 1;
		}
		
		else {
		resultado =numero * factorial(numero-1); 	
		}
		
		
		return resultado;
	}
	
	
	
	public static int sumaRecursiva(int numero) {
		int resultado = 0;
		
		if(numero==1)
		{
			return 1;
		}
		else {
			resultado=numero + sumaRecursiva(numero-1);
			System.out.println(resultado);
		}
		
		return resultado;
	}
	
	
	
	
	
	
	

}
