package models;

public class Triangulo extends Forma{
	private int base;
	private int altura;
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "\n Triângulo, Área: " + this.calcularArea();
	}
	@Override
	public double calcularArea() {
		return ( (getBase() * getAltura())/2 );
	}	
}
