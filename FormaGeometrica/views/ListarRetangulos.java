package views;

import controller.FormaController;
import models.Forma;
import models.Retangulo;

public class ListarRetangulos {	

	public static void renderizar() {

		FormaController controllerForma = new FormaController();

		System.out.println("\n **** LISTAGEM DE RETÂNGULOS **** \n");

		for (Forma formaCadastrada : controllerForma.listarRetangulos()) {
			if(formaCadastrada instanceof Retangulo)
				System.out.println(formaCadastrada);
		}
	}
}