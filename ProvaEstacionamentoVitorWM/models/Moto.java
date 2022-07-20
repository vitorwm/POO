package models;

public class Moto extends Automovel{

    @Override
	public  double calcularEstadia(double taxa, double aleatorio){
        
        
        return ( taxa * aleatorio);
    }

    @Override
	public String toString() {
		return "Placa: "+getPlaca()+ "| Modelo "+getModelo()+ "| Cor: "+ getCor();
	}
}