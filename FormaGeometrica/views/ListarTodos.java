package views;
import controller.FormaController;
import models.Forma;

public class ListarTodos {

	public static void renderizar() {

		FormaController controllerForma = new FormaController();

		System.out.println("\n **** LISTAGEM DE TODAS AS FORMAS **** \n");

		for (Forma formas : controllerForma.listar()) {
			System.out.println(formas);
		}
	}
}
