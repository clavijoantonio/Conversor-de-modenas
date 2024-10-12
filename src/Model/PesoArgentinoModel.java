package Model;

public class PesoArgentinoModel extends ModenasModel {

	   String codigo= "ARS";
	   
	   String codigoBase="USD";
	   
	 
	   ModenasModel modenaString= conversorMoneda(codigo, codigoBase);
	   
	   String valorMoneda= modenaString.getConversion();
	   
	   
	   public double coviertePesoArgADolar(int valor) {
		   double resultado;
		   
		   resultado= valor/Double.parseDouble(valorMoneda);
		   
		   return resultado;
		   
	   }
	   
	   public double covierteDolarAPesoArg(int valor) {
		   double resultado;
		   
		   resultado= valor*Double.parseDouble(valorMoneda);
		   
		   return resultado;
		   
	   }
}
