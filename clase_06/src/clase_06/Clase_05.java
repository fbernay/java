package clase_06;

public class Clase_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		System.out.println("Clase 06");
//		System.out.println("----------------------------");
//		System.out.println("recursividad");
//		System.out.println(sumaRecursiva(100));
//		System.out.println("----------------------------");
//		System.out.println("Calcular area de rectangulo");
//		calcularAreaRectangulo(45,55);
//		System.out.println("----------------------------");
//		int[] vector= {3,4,5,6,7,6};
//		mostrarVector(vector);
//		System.out.println("Sumar dos enteros");
//		
//		int suma = sumarDosEnteros(34,65);
//		System.out.println(suma);
//		System.out.println("----------------------------");
//		System.out.println("Calcular y sumar IVA");
//		double precioMasIVA=calcularYSumarIVA(100);
//		System.out.println(precioMasIVA);
//		System.out.println("----------------------------");
//		
//		System.out.println("Calcular si el numero es par");
//		boolean esPar=esParOImpar(45);
//		System.out.println(esPar);
//		
//	
			
	}
	
	
	private static boolean esParOImpar(int numero) {
		boolean esPar=false;
		if(numero%2==0)
			esPar=true;
		return esPar;
	}


	private static double calcularYSumarIVA(int i) {
		double resultado=i*1.21;
		return resultado;
		
		
		
		
		
	}
	
	
	
	
	


	private static int sumarDosEnteros(int i, int j) {
		return i+j;
	}


	private static void mostrarVector(int[] vector) {
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
	}
	
	


	public static int sumaRecursiva(int numero) {
		int resultado = 0;
		
		if(numero==1)
		{
			return 1;
		}
		else {
			resultado=numero + sumaRecursiva(numero-1);
		}
		
		return resultado;
	}
	
	
	public static void calcularAreaRectangulo(int base, int altura) {
		double area = 0;
		
		area=base*altura;
		System.out.println("Area: "+area+ " m2");
		
	}
	

	
	
	
	
	
	

}
