package Model;

public class RealBrasileñoModel extends ModenasModel {

	  String codigo= "BRL";
	   
	   String codigoBase="USD";
	   
	 
	   ModenasModel modenaString= conversorMoneda(codigo, codigoBase);
	   
	   String valorMoneda= modenaString.getConversion();
	   
	   
	   public double covierteRealBrADolar(int valor) {
		   double resultado;
		   
		   resultado= valor/Double.parseDouble(valorMoneda);
		   
		   return resultado;
		   
	   }
	   
	   public double covierteDolarARealBr(int valor) {
		   double resultado;
		   
		   resultado= valor*Double.parseDouble(valorMoneda);
		   
		   return resultado;
		   
	   }
}
