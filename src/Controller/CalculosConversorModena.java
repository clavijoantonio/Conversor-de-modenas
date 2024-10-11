package Controller;

import Model.PesoColombianoModel;

public class CalculosConversorModena {

	int opciones;
    int valorConversion;
    int mostarResultado;
    PesoColombianoModel pesoCol= new PesoColombianoModel();
    
	public CalculosConversorModena(int opciones, int valorConversion) {
		
		this.opciones = opciones;
		this.valorConversion = valorConversion;
	}

	
	public void ejecutaOpcion() {
		switch (opciones) {
		case 1:
				
					break;
		case 2:
					
					break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			mostarResultado=pesoCol.coviertePesoADolar(valorConversion);
			System.out.println(mostarResultado);
			
			break;
			
	

		default:
			break;
		}
	}
	
	public String convierteDolarPesoArgentino() {
		String valor="aca estoy";
		return valor;
	}
}
