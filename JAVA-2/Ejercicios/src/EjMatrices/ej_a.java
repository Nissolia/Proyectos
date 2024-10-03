package EjMatrices;

import java.util.Scanner;

public class ej_a {
	final static int MAX = 5;

	public static void main(String[] args) {
		// Scanner y variables
		Scanner s = new Scanner(System.in);
		int col;

		// Hacemos un control de la columna para que no se pase poniendo numeros
		do {
			System.out.println("Dame las columnas de nuestra matriz:");
			col = s.nextInt();
		} while (col < 0 || col > 20);
		// Creamos la matriz con la información que tenemos
		int[][] matriz = new int[MAX][col];
		// Comenzamos a rellenar la matriz
		for (int i = 0; i < MAX; i++) {
			for (int j = 0; j < col; j++) {
				matriz[i][j] = aleatorio();
			}
		}
		// Mostramos la matriz
		for (int i = 0; i < MAX; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Matriz: " + i + " , " + j + " = " + matriz[i][j]);

			}
		}
		s.close();
	}

	/* Funcion creada para el número aleatorio */
	private static int aleatorio() {
		// Creamos un numero aleatorio
		int rand = (int) (Math.random() * 11);
		// Devolvemos el número al azar
		return rand;

	}
}
