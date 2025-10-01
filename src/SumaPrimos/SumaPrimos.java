package SumaPrimos;
import java.util.Scanner;
/*
Realiza un programa en Java que sume los numeros primos desde 0 a un dado (N).

	 0 --- 1   
	 1 --- 1-1 
	 2 --- 1-2 
	 3 --- 1-3 
EjeX 4 --- 1-4 
	 5 --- 1-5
	 6 --- 1-6 
 	 7 --- 1-7 
		EjeI		
*/

/*NOTA: Los numeros primos son los numeros naturales mayores que 1 que solo sean divisbles entre 1 y por si mismo
Ej:
[2, 3, 5, 7, 11, 13, 17]
*/

public class SumaPrimos {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Introduce el valor de N: ");
		int N = input.nextInt();
		int suma = 0;
		for (int x= 2;x<=N;x++) {
			int esPrimo = 1;
			for (int i=2; i<x;i++) {
				if (x%i==0) {
				esPrimo = 0;
				}
			}
			if (esPrimo == 1) {
				//System.out.println(x);
				suma += x;
			}
		}
		System.out.print("Suma: "+suma);
	}
}