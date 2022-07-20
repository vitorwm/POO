package controller;

import java.util.ArrayList;
import models.Forma;

public class FormaController {

	private static ArrayList<Forma> formas = new ArrayList<Forma>();

	
	public static void cadastrar(Forma forma) 
	{
		formas.add(forma);	
	}
	
	public ArrayList<Forma> listar(){
		return formas;
	}
	
	public ArrayList<Forma> listarRetangulos(){
		return formas;
	}
	
	public ArrayList<Forma> listarCirculos(){
		return formas;
	}
	
	public ArrayList<Forma> listarTriangulos(){
		return formas;
	}
}
