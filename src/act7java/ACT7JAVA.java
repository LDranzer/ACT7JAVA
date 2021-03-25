/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act7java;

import java.util.Scanner;

/**
 *
 * @author LDranzer
 */
public class ACT7JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int cont=0;
    Scanner lol = new Scanner(System.in);
        System.out.println("Ingresa el Límite de l sucesión Fibonacci");
        cont = lol.nextInt();
    Fibonacci f1 = new Fibonacci("fibonacci 1",cont); 
    f1.mostrarSerie();
        
	int fin, contador = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingresa el límite de los numeros primos:");
	fin = sc.nextInt();
	for (int x = 0; x <= fin; x++) {
		if (esPrimo(x)) {
			contador++;
		System.out.print(String.valueOf(x) + ",");
		}
	}
	System.out.printf("\nNúmeros primos: %d", contador);
	sc.close();
    
}
public static boolean esPrimo(int numero) {
		// El 0, 1 y 4 no son primos
		if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}
		for (int x = 2; x < numero / 2; x++) {
			// Si es divisible por cualquiera de estos números, no
			// es primo
			if (numero % x == 0)
				return false;
		}
		// Si no se pudo dividir por ninguno de los de arriba, sí es primo
		return true;
	}}