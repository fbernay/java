package clase_04;

import java.util.Arrays;

public class Clase_02 {

	public static void main(String[] args) {

		int[] lista_numeros = new int[6];

		lista_numeros[0] = 134;
		lista_numeros[1] = 234;
		lista_numeros[2] = 334;
		lista_numeros[3] = 344;
		lista_numeros[5] = 345;
		lista_numeros[4] = 634;

		System.out.println("Ascendente");
		for (int i = 0; i < lista_numeros.length; i++) {
			System.out.println(lista_numeros[i]);
		}

		System.out.println("-----------------------------------------------");
		System.out.println("Descendente");

		for (int i = lista_numeros.length - 1; i >= 0; i--) {
			System.out.println(lista_numeros[i]);
		}

		System.out.println("-----------------------------------------------");

		System.out.println("Suma de los valores de una lista");
		int suma = 0;

		for (int i = 0; i < lista_numeros.length; i++) {
			suma += lista_numeros[i];
		}
		System.out.println(suma);

		System.out.println("-----------------------------------------------");


		System.out.println("Copia de los valores de una lista");
		
		
		int[] pares = {5,4,6,8,10, 56, 10, 10, 10};
		int [] datos = new int [pares.length];
		
		suma =0;
		for (int i = 0; i < datos.length; i++) {
			datos[i]=pares[i];
			System.out.println(datos[i]);
		}
		
		Arrays.sort(datos);///ordena los valores de menor a mayor
		
		System.out.println("-----------------------------------------------");

		
		int contador =0; 
		for(int a=0;a<pares.length;a++){ 
		if (pares[a]==10) 
		contador ++; 
		} 
		System.out.println("El numero 10 aparece: "+contador+ " veces");
		
		
		
		System.out.println("-----------------------------------------------");

		
		float total=0; 
		for(int a=0;a<pares.length;a++){ 
		total+=pares[a]; 
		} 
		System.out.println("La suma total es: "+total); 
		System.out.println("El promedio es: "+total/pares.length);
		
		
		
		
	}

}
