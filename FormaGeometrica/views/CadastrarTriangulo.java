package views;
import models.Triangulo;
import console.Console;
import controller.FormaController;

public class CadastrarTriangulo {

	private static Triangulo triangulo;

	public static void renderizar() {

		triangulo = new Triangulo();
		
		System.out.println("\n ****CADASTRO DO TRIÂNGULO**** \n");
		triangulo.setAltura(Console.lerInteiro("\nDigite a altura do triângulo: "));

		triangulo.setBase(Console.lerInteiro("\nDigite a base do triângulo: "));
		FormaController.cadastrar(triangulo);
		
		System.out.println("\nTriângulo cadastrado com sucesso!\n");
	}
}
