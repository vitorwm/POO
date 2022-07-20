package views;
import console.Console;

public class Principal 
{

	static int Menu()
	{
		int opcao;
		
		System.out.println("\n0- Sair");
		System.out.println("1- Cadastrar retângulo");
		System.out.println("2- Cadastrar triângulo");
		System.out.println("3- Cadastrar circulo");
		System.out.println("4- Listar todos");
		System.out.println("5- Listar retângulos");
		System.out.println("6- Listar triângulos");
		System.out.println("7- Listar circulos");

		opcao = Console.lerInteiro("\nDigite a opção que deseja: \n");
		return opcao;
	}
	
	public static void main(String[] args) {
		
		int op;

		do{
			op = Menu();

			switch (op){

				case 0: System.out.println("\nPrograma encerrado!\n"); break;
				
				case 1:	CadastrarRetangulo.renderizar(); break;
				
				case 2: CadastrarTriangulo.renderizar(); break;
				
				case 3: CadastrarCirculo.renderizar(); break;
				
				case 4: ListarTodos.renderizar(); break;
				
				case 5: ListarRetangulos.renderizar(); break;
				
				case 6: ListarTriangulos.renderizar(); break;
				
				case 7: ListarCirculos.renderizar(); break;
				
				default:
					System.out.println("\nOpção inválida\n");
			}
		} while (op != 0);
				
	}	
}
