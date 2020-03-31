
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Clase que hace distintas funciones a adivinar
 * @author Usuario
 *
 */

public class Codigoofuscado {
	public static void Menu(String parametro1) {
		System.out.println(parametro1);
	}

	public static int Multiplicacion(int parametro1) {
		
		if (parametro1 == 0) {
			
			return 1;
		
		} else {
			
			int variable1 = 1;
			
			int variable2 = parametro1;
			
			do {
			
				variable1 *= variable2;
				
				variable2--;
			
			} while (variable2 > 0);
			
			return variable1;
		}
	}

	public static String Darlavuelta(String parametro1) {
		String vuelta = "";
		int numero = 0;
		do {
			vuelta = parametro1.charAt(numero) + vuelta;
			numero++;
		} while (numero< parametro1.length());
		vuelta = parametro1 + vuelta;
		return vuelta;
	}

	public static void main(String[] args) throws IOException {
    Scanner variable1 = new Scanner(System.in);
    int variable2; 

    imprimirMenu(variable1);
 
	}

	public static void imprimirMenu(Scanner variable1) {
		int variable2;
		do {
		
			Menu("BIENVENIDO AL PROGRAMA OFUSCADO"); 
		
			Menu("-------------------------------");
		
			Menu("Elija una opcion:");
		 
			Menu("1) ADIVINA QUÉ HACE");
		
			Menu("2) ADIVINA QUÉ HACE");
		
			Menu("3) ADIVINA QUÉ HACE");
		 
			Menu(">");
		
			String variable3 = variable1.nextLine();
		
			variable2 = Integer.parseInt(variable3);
		
			if (variable2 == 1) {
   
				Menu("Inserte un número:");
		
				String variable4 = variable1.nextLine();
		
				int variable5 = Integer.parseInt(variable4);
   
				int variable6 = Multiplicacion(variable5);
   
				Menu("El resultado es:"); 
		
				Menu("" + variable6);
   
			} else {
		
			if (variable2 == 2) {
  
				Menu("Inserte una palabra:");
  
				String variable7 = variable1.nextLine();
   
				String variable8 = Darlavuelta(variable7);
   
				Menu("El resultado es:");
  
				Menu("" + variable8);

 }
 
 } 
 
} while (variable2 != 3);
	}
}
