package View;

import java.util.Scanner;

public class VistasView {

	int opcion=7;
	
	Scanner ingresaDatos = new Scanner(System.in);

	String menu ="""
			    1) Dolar >>> Peso Argentino
			    2) Peso Argentino >>> Dolar
			    3) Dolar >>> Real Brasile�o
			    4) Real Brasile�o >>> Dolar
			    5) Dolar >>> Peso Colombiano
			    6) Peso Colombiano >>> Dolar
			    7) salir 
			""";
	public void presentarMenu() {
	do {
		System.out.println("****************************");
		System.out.println("Sea bienvenido/a al Conversor de Modena =");
		System.out.println(menu);
		System.out.println("Elija una opcion valida: "); ingresaDatos.nextInt();
		System.out.println("****************************");
		
	}while(opcion!=7);
 }
}
