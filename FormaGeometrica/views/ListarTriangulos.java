package views;

import controller.FormaController;
import models.Forma;
import models.Triangulo;

public class ListarTriangulos {	

	public static void renderizar() {

		FormaController controllerForma = new FormaController();

		System.out.println("\n **** LISTAGEM DE TRIÂNGULOS **** \n");

		for (Forma formaCadastrada : controllerForma.listarTriangulos()) {
			if (formaCadastrada instanceof Triangulo)
				System.out.println(formaCadastrada);
		}
	}
}
