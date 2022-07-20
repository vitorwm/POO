package views;
import models.Circulo;
import console.Console;
import controller.FormaController;

public class CadastrarCirculo {

	private static Circulo circulo;

	public static void renderizar() {

		circulo = new Circulo();
		
		System.out.println("\n ****CADASTRO DO CIRCULO**** \n");

		circulo.setRaio(Console.lerInteiro("\nDigite o raio do circulo: "));
		
		FormaController.cadastrar(circulo);

		System.out.println("\nCirculo cadastrado com sucesso!\n");
	}
}
