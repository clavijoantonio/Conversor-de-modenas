package Controller;

import Model.PesoArgentinoModel;
import Model.PesoColombianoModel;
import Model.RealBrasileñoModel;

public class CalculosConversorModena {

	int opciones;
    int valorConversion;
    double mostarResultado;
    
    PesoColombianoModel pesoCol= new PesoColombianoModel();
    PesoArgentinoModel pesoArg= new PesoArgentinoModel();
    RealBrasileñoModel realBra= new RealBrasileñoModel();
    
	public CalculosConversorModena(int opciones, int valorConversion) {
		
		this.opciones = opciones;
		this.valorConversion = valorConversion;
	}

	
	public void ejecutaOpcion() {
		
		switch (opciones) {
		
		case 1:
			mostarResultado=pesoArg.covierteDolarAPesoArg(valorConversion);
			System.out.println("El valor de "+ valorConversion+"[USD] corresponde al valor final de =>>> "
			+String.format("%.2f", mostarResultado)+"[ARS]");
			  
			break;
		case 2:
			mostarResultado=pesoArg.coviertePesoArgADolar(valorConversion);
			System.out.println("El valor de "+ valorConversion+"[ARS] corresponde al valor final de =>>> "
			+String.format("%.2f", mostarResultado)+"[USD]");	
			
			break;
		case 3:
			mostarResultado=realBra.covierteDolarARealBr(valorConversion);
			System.out.println("El valor de "+ valorConversion+"[USD] corresponde al valor final de =>>> "
			+String.format("%.2f", mostarResultado)+"[BRL]");
			
			break;
		case 4:
			mostarResultado=realBra.covierteRealBrADolar(valorConversion);
			System.out.println("El valor de "+ valorConversion+"[BRL] corresponde al valor final de =>>> "
			+String.format("%.2f", mostarResultado)+"[USD]");	
			
			break;
		case 5:
			mostarResultado=pesoCol.covierteDolarAPesoCol(valorConversion);
			System.out.println("El valor de "+ valorConversion+"[USD] corresponde al valor final de =>>> "
			+String.format("%.2f", mostarResultado)+"[COL]");
			
			break;
		case 6:
			
			mostarResultado=pesoCol.coviertePesoColADolar(valorConversion);
			System.out.println("El valor de "+ valorConversion+"[COP] corresponde al valor final de =>>> "
			+String.format("%.2f", mostarResultado)+"[USD]");
			
			break;
		
		default:
			System.out.println("Opcion no valida");
			break;
		}
	}
	
	
}
