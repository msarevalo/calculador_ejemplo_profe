package co.edu.uelbosque.swii.calculadora;

public class Suma implements Comando {

	public double ejecutarOperacion(double a, double b) {
		return this.suma(a, b);
	}

	public static double suma(double numero1, double numero2) {
		double resultado = numero1 + numero2;
		return resultado;
	}
}
