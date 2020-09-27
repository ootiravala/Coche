package poo;

public class Coche {

	private int ruedas, largo, ancho, motor, peso_plataforma, peso_total;

	String color;

	boolean climatizador, asientos_cuero;

	public Coche() {

		ruedas = 4;

		largo = 2000;

		ancho = 300;

		motor = 1600;

		peso_plataforma = 500;

		color = "";

	}

	public String dime_largo() {

		return " El largo del coche es: " + largo;

	}

	public void establece_color() {
		color = "azul";
	}

	public String dime_color() {
		return "EL color del coche es " + color;
	}
}
