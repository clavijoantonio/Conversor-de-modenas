package View;

import java.util.Scanner;

import Controller.CalculosConversorModena;



public class VistasView {

	int opcion;
	
	
	
	Scanner ingresaDatos = new Scanner(System.in);
	
	
    
	

	String menu ="""
			    1) Dolar >>> Peso Argentino
			    2) Peso Argentino >>> Dolar
			    3) Dolar >>> Real Brasileño
			    4) Real Brasileño >>> Dolar
			    5) Dolar >>> Peso Colombiano
			    6) Peso Colombiano >>> Dolar
			    7) salir 
			""";
	
	
	 
	
     
	public void presentarMenu() {
	do {
		System.out.println("****************************");
		System.out.println("Sea bienvenido/a al Conversor de Modena =");
		System.out.println(menu);
		System.out.print("Elija una opcion valida: "); opcion= ingresaDatos.nextInt();
		System.out.println("****************************");
		
		CalculosConversorModena opciones= new CalculosConversorModena(opcion);
		
	}while(opcion!=7);
  }
	
	
	
	
	
}
