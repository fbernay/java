import java.util.Scanner;

public class Clase_03 {

	private static final String List = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/// practicas

		// 1.
		// multiplos de 5

//		System.out.println("FOR");
//
//		for (int i = 1; i <= 100; i++) {
//			if (i % 5 == 0) {
//				System.out.println(i + " es multiplo de 5");
//			}
//		}
//		System.out.println("-----------------------------------");
//
//		System.out.println("WHILE");
//
//		int i = 1;
//		while (i <= 100) {
//			if (i % 5 == 0) {
//				System.out.println(i + " es multiplo de 5");
//			}
//			i++;
//		}
//
//		System.out.println("-----------------------------------");
//
//		System.out.println("DO WHILE");
//
//		i = 1;
//		do {
//			if (i % 5 == 0) {
//				System.out.println(i + " es multiplo de 5");
//			}
//			i++;
//		} while (i <= 100);
//
//		System.out.println("-----------------------------------");

		// 2.
		// la variable y nunca deja de aumentar y nunca sale del bucle
//		i = 0;
//		while (true) {
//			i++;
//			if (i < 10)
//				continue;
//			 i++;// cuando i == 10 esta linea lo convierte en 11 y nunca cae en el break.
//			if (i == 10)
//				break;
//		}

		// 3.
//		String clave = "";
//		int contador = 0;
//		do {
//			System.out.println("Ingrese clave");
//			Scanner teclado = new Scanner(System.in);
//			clave = teclado.nextLine();
//			System.out.println(clave);
//
//			if (clave.equals("1234") ) {
//				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
//				break;
//			} 
//			
//			else {
//				contador++;
//				System.out.println("“Lo siento, esa no es la combinación”");
//			}
//
//		} while (contador < 4);

		// 4
//		System.out.println("Ingrese un número");
//		Scanner teclado = new Scanner(System.in);
//		int numero = teclado.nextInt();
//		for ( i = 1; i <=10 ; i++) {
//			System.out.println(numero+" x "+i+" = "+i*numero);
//		}

		// 5

//		System.out.println("Ingrese un número");
//		Scanner teclado = new Scanner(System.in);
//		String numero = teclado.nextLine();	
//		System.out.println("El numero "+numero+" tiene "+numero.length()+ " digitos");

		// 6

//		int contador = 0;
//		float suma = 0;
//		float numero = 0;
//
//		do {
//			Scanner teclado = new Scanner(System.in);
//			System.out.println("Ingrese un número");
//			numero = teclado.nextInt();
//
//			if (numero > 0) {
//				suma += numero;
//				contador++;
//
//			} else {
//				System.out.println("El promedio es: " + suma / contador);
//			}
//		} while (numero >= 0);

		// 7 (fibonacci)

//		Scanner teclado = new Scanner(System.in);
//  		System.out.println("Ingrese un número");
// 		int numero = teclado.nextInt();
//		int a=0;
//		int b=1;
//		int c=0;
//		System.out.println(a);
//		System.out.println(b);
// 		for (int i = 1; i <= numero; i++) {
// 			c=a+b;
// 			System.out.println(c);
// 			a=b;
// 			b=c;
// 			
//		}

		// 8
//		int[] lista_numeros = new int[] {123,0,-1234,88,-904,553,-47,-31,-32,190};
//		int contador_positivos=0;
//		int contador_negativos=0;
//		for (int i = 0; i < lista_numeros.length; i++) {
//			if(lista_numeros[i]>=0)
//				contador_positivos++;
//			else
//				contador_negativos++;
//		}
//		
//		System.out.println("cantidad de positivos: "+contador_positivos);
//		System.out.println("cantidad de negativos: "+contador_negativos);
//		
		// 9
//		while (true) {
//
//			Scanner teclado = new Scanner(System.in);
//			System.out.println("Ingrese un número");
//			int numero = teclado.nextInt();
//
//			if ((numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0 || numero % 7 == 0)
//					&& (numero != 2 && numero != 3 && numero != 5 && numero != 7)) {
//				System.out.println("No es primo");
//			} else {
//				System.out.println("Es primo");
//			}
//		}

		
		//10
//		Scanner teclado = new Scanner(System.in);
//		System.out.println("Ingrese un número");
//		int numero = teclado.nextInt();
//		int suma=0;
//		int contador=1;
//		if(numero>=0)
//		{
//				while(contador<=100) {
//					suma+=numero+contador;
//					System.out.println(numero+contador);
//					contador++;
//				}
//				System.out.println(suma);

		int [] x = {120,200,0,016};
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
	}

}
