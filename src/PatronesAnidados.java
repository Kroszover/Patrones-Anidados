import java.util.Scanner;

public class PatronesAnidados {
	Scanner teclado = new Scanner(System.in);

	public static void main(final String[] args) {

		final Scanner sc = new Scanner(System.in);
		final Scanner teclado = new Scanner(System.in);
		System.out.print("Por favor ingrese el tamaño de la figura: ");
		final int n = teclado.nextInt();
		// TODO Auto-generated method stub
		Patron1(n);
		{
			System.out.println();
		}
		Patron2(n);
		{
			System.out.println();
		}
		Patron3(n);
		{
			System.out.println();
		}
		Patron4(n);
		{
			System.out.println();
		}
	}

	// Creación de metodo para la figura 1
	public static void Patron1(final int n) {
		{// Limite para no ingresar un número mayor a 5
			if (n >= 0 && n <= 5) {
				// Linea superior
				for (int i = 0; i < n; i++) {
					System.out.print("*");
				}
				System.out.println();

				// centro de la forma
				for (int i = 0; i < n - 2; i++) {
					System.out.print("*");
					for (int j = 0; j < n - 2; j++) {
						System.out.print(" ");
					}
					System.out.println("*");
				}

				// Linea inferior
				for (int i = 0; i < n; i++) {
					System.out.print("*");
				}
			} else {
				System.out.println("Error. El dato a ingresar para este patrón " + "estar entre 1 y 5");
			}

		}

	}

	// Creción de metodo para el Patrón 2
	public static void Patron2(final int n) {

		{// Limite para no ingresar un número mayor a 5
			if (n >= 0 && n <= 5) {
				// Linea superior
				for (int i = 0; i < n; i++) {
					System.out.print("*");
				}
				System.out.println();

				// centro de la forma
				for (int i = 0; i < n - 2; i++) {
					for (int j = 0; j < n; j++) {
						if (j == n - 2 - i) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}

				// Linea inferior
				for (int i = 0; i < n; i++) {
					System.out.print("*");
				}
			} else {
				System.out.println("Error. El dato a ingresar para este patrón " + "estar entre 1 y 5");
			}

		}

	}

	// Creación de metodo para el patrón 3
	public static void Patron3(final int n) {
		{
			// Linea superior
			final int y = (n - 1);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if ((i == j) || ((i + j) == y)) {
						System.out.print("X");
					} else {
						System.out.print(" ");
					}

				}
				System.out.println();
			}

		}

	}

	// Creación de metodo para el Patrón 4
	public static void Patron4(final int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			// Condicion para la primera linea del patron
			if (i == 0) {
				for (j = 0; j < n; j++) {
					if (j < n - 1) {
						System.out.printf("*");
					} else {
						System.out.printf(" ");
					}
				}
				System.out.printf("\n");
			}
			// Parte central de la figura
			else if (i >= 1 && i < n - 1) {
				for (j = 0; j < n - 1; j++) {
					if (j >= 1 && j < n - 1) {
						System.out.printf("*");
					} else {
						System.out.printf(" ");
					}
				}
				System.out.print("\n");
				//Parte final de la figura
			} else {
				for (j = 0; j < n; j++) {
					if (j >= 1) {
						System.out.printf("*");
					} else {
						System.out.printf(" ");
					}
				}
				System.out.printf("\n");
			}
		}
		
	}
}