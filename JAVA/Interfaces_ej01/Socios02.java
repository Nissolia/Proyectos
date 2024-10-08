package Interfaces_ej01;

public class Socios02 implements Comparable<Socios02> {
	/* Atributos */
	int id_socio;
	String nombre;
	double cuenta;

	/* Constructores */
	public Socios02(int id_socio, String nombre, double cuenta) {
		super();
		this.id_socio = id_socio;
		this.nombre = nombre;
		this.cuenta = cuenta;
	}

	/* Getter y setters */
	public int getId_socio() {
		return id_socio;
	}

	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCuenta() {
		return cuenta;
	}

	public void setCuenta(double cuenta) {
		this.cuenta = cuenta;
	}

	/* Métodos */
	public static Socios02[] generarSocios(int cantidad) {
		Socios02[] socios = new Socios02[cantidad];
		int rand;
		for (int i = 0; i < cantidad; i++) {
			rand = (int) (Math.random() * 100);
			int id_socio = i + 1;
			String nombre = generarNombreAleatorio();
			double cuenta = rand;
			socios[i] = new Socios02(id_socio, nombre, cuenta);
		}
		return socios;
	}

	@Override
	public int compareTo(Socios02 o) {
		return Double.compare(this.cuenta, o.getCuenta());
	}

	// Método para generar un nombre aleatorio
	private static String generarNombreAleatorio() {
		String[] nombres = { "Juan", "María", "Pedro", "Ana", "Luis", "Sofía", "Carlos", "Laura", "Pablo", "Elena",
				"Manuel", "Isabel", "Antonio", "Carmen", "Francisco", "Lucía", "Diego", "Marta", "Javier", "Raquel",
				"Alberto", "Natalia", "José", "Rocío", "David", "Silvia", "Miguel", "Eva", "Alejandro", "Patricia" };

		int rand = (int) (Math.random() * 30);

		return nombres[rand];
	}

	/* Ordenamiento por inserción */
	public static void OrdenarSocios(Socios02[] socios) {
		int n = socios.length;
		for (int i = 1; i < n; ++i) {
			Socios02 aux = socios[i];
			int j = i - 1;

			// Mover los elementos de socios[0..i-1] que son mayores que key
			// a una posición adelante de su posición actual
			while (j >= 0 && socios[j].compareTo(aux) > 0) {
				socios[j + 1] = socios[j];
				j = j - 1;
			}
			socios[j + 1] = aux;
		}
	}
}
