package views;
import models.Retangulo;
import console.Console;
import controller.FormaController;

public class CadastrarRetangulo {

	private static Retangulo retangulo;

	public static void renderizar() {

		retangulo = new Retangulo();
		
		System.out.println("\n ****CADASTRO DO RETÂNGULO**** \n");

		retangulo.setAltura(Console.lerInteiro("\nDigite a altura do retângulo: "));
		retangulo.setLargura(Console.lerInteiro("\nDigite a largura do retângulo: "));

		FormaController.cadastrar(retangulo);
		
		System.out.println("\nRetângulo cadastrado com sucesso!\n");
	}
}
