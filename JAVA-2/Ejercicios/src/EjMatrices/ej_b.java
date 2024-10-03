package EjMatrices;

import java.util.Scanner;

public class ej_b {
	final static int MAX = 25;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size;
		// Le pedimos la información al usuario
		do {
			System.out.println("Dime el tamaño de la matriz:");
			size = s.nextInt();
			// Comprobamos que la persona mete los numeros correctos
		} while (size < 0 || size > MAX);
		// Creamos la matrices
		int[][] matriz = new int[size][size];
		int[][] matriz2 = new int[size][size];
		int[][] matrizResult = new int[size][size];
		// Rellenado de datos
		rellenadoDatos(size, matriz, 1);
		rellenadoDatos(size, matriz2, 2);
		// Mostrar matriz 1
		mostrarMatriz(size, matriz, 1);
		mostrarMatriz(size, matriz2, 2);
		// Mostrar suma de matrices
		System.out.println("Matriz resultante");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrizResult[i][j] = matriz[i][j] + matriz2[i][j];
				System.out.print(matrizResult[i][j] + " ");
			}
			System.out.println();
		}

		s.close();
	}

	private static void rellenadoDatos(int size, int matriz[][], int mtype) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("Valor para la fila " + i + " y columna " + j + " de la matriz " + mtype + ": ");
				matriz[i][j] = s.nextInt();
			}
		}

	}

	private static void mostrarMatriz(int size, int matriz[][], int mtype) {
		System.out.println("Matriz " + mtype);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

	}

}
