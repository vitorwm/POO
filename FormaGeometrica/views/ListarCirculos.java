package views;

import controller.FormaController;
import models.Circulo;
import models.Forma;

public class ListarCirculos {

	public static void renderizar() {

		FormaController controllerForma = new FormaController(); 

		System.out.println("\n **** LISTAGEM DE CIRCULOS **** \n");

		for (Forma formaCadastrada : controllerForma.listar()) {
			if(formaCadastrada instanceof Circulo)
				System.out.println(formaCadastrada);
		}
		}
	}
