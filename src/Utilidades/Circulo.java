package Utilidades;

/**   
 * @author Sergio
 * @version 1.0
 * @since 23/11/2021
 */

public class Circulo {
	/**
	 * rad establece el radio double
	 */
	private double rad;

	/**
	 * @param radio radio del circulo double
	 */
	public Circulo(double radio) {
		this.rad = radio;
	}

	/**
	 * Devuelve el radio del circulo
	 * @return radio del circulo 
	 */
	public double getRad() {
		return rad;
	}

	/**
	 * Asigna el radio del circulo
	 * @param rad radio del circulo double
	 */
	public void setRad(double rad) {
		this.rad = rad;
	}

	/**
	 * Muestra color, diametro y area del circulo
	 */
	public void imprimir() {
		String color = "rojo";
		System.out.println("Diámetro: " + 2 * rad);
		System.out.println("Color: " + color);
		double area = 2 * 3.1416 * rad * rad;
		System.out.println(area);
	}

	/**
	 * @param otro el otro circulo con el que se va a comparar
	 * @param conDecimales si true compara con decimales, si false compara sin decimales
	 * @return true si son iguales, false en otro caso
	 */
	public boolean esIgual(Circulo otro, boolean conDecimales) {
		double radio1 = this.rad;
		double radio2 = otro.getRad();
		if (conDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}
