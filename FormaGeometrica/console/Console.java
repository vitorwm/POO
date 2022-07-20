package console;

import java.util.Scanner;

public class Console {
		private static Scanner ler = new Scanner(System.in);
		
		public static int lerInteiro(String msg){
			boolean valCerto = false;
			int valor = 0;
			do {
				try {
					System.out.println(msg);
					valor = Integer.parseInt(ler.next());
					valCerto = true;
				} catch (Exception e) {
					System.out.println("Tipos incompatíveis");
				}
			} while (!valCerto);
			return valor;
	}
}