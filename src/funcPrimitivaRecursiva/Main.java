package funcPrimitivaRecursiva;

/**
 * @author Sofía Pizarro - alu0100831696
 * @category CC - Práctica3 - Producto - Función Primitiva Recursiva
 * @date 09/11/2017
 * @class Main
 **/

import java.util.Scanner;

public class Main {
	static Scanner teclado = new Scanner(System.in);
	static int x = 0;
	static int y = 0;

	public static void main(String[] args) {
			
		ProductoPrimRec prod = new ProductoPrimRec();	
		int elige = 0;
	
		
		System.out.println("PRÁCTICA 3: Implementación de Funciones Primitivas Recursivas.");
		System.out.println("\n  -- Función producto(x,y) --");
		System.out.println("1. Producto");
		System.out.println("Otras funciones recursivas");
		System.out.println("2. Nula");
		System.out.println("3. Sucesor");
		System.out.println("4. Predecesor");
		System.out.println("5. Not");
		System.out.println("6. Identidad");
		System.out.println("7. Suma");
		System.out.println("8. Resta");
		System.out.println("9. Potencia");
		System.out.println("10. Factorial");
		System.out.println("11. Minimizar");
		System.out.println("12. Salir");
		System.out.println("¿Qué desea hacer?: ");
		elige = teclado.nextInt();
		
		do {
					
			switch (elige) {
			case 1: 
				dosDatos();
				System.out.println("x * y = " + prod.producto(x, y));
				break;
			case 2: 
				
				System.out.println("Función nula = " + prod.z(x));
				break;
			case 3: 
				unDato();
				System.out.println("Sucesor = " + prod.s(x));
				break;
			case 4: 
				unDato();
				System.out.println("Predecesor = " + prod.pred(x));
				break;
			case 5: 
				unDato();
				System.out.println("Not = " + prod.not(x));
				break;
			case 6: 
				unDato();
				System.out.println("Identidad = " + prod.identidad(x));
				break;
			case 7: 
				dosDatos();
				System.out.println("Suma = " + prod.suma(x, y));
				break;
			case 8: 
				dosDatos();
				System.out.println("Resta = " + prod.resta(x, y));
				break;
			case 9: 
				dosDatos();
				System.out.println("Potencia = " + prod.potencia(x, y));
				break;
			case 10: 
				unDato();
				System.out.println("Factorial = " + prod.factorial(x));
				break;
			case 11: 
				dosDatos();
				System.out.println("Minimizar = " + prod.f1(x, y));
				break;
			
			case 12: 
				System.out.println("Hasta pronto.");
				System.exit(0);
	
			}
			
		}while (elige <= 0 || elige > 11);
	
		teclado.close();
	}
	
	static void unDato () {
		System.out.print("Valor de x = ");
		x = teclado.nextInt();
				
	}
	
	static void dosDatos () {
		System.out.print("Valor de x = ");
		x = teclado.nextInt();
		System.out.print("Valor de y = ");
		y = teclado.nextInt();
	}
}