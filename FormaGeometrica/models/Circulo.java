package models;

public class Circulo extends Forma{
	private int raio;

	public int getRaio() {
		return this.raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	@Override
	public String toString() {
		return " \n Circulo, Área: "+ this.calcularArea();
	}

	@Override
	public double calcularArea() {
		return ( 3.14 * Math.pow(getRaio(), 2) );
	}
}