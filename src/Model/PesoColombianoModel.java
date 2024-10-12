package Model;

public class PesoColombianoModel extends ModenasModel {
    
   String codigo= "COP";
   
   String codigoBase="USD";
   
 
   ModenasModel modenaString= conversorMoneda(codigo, codigoBase);
   
   String valorMoneda= modenaString.getConversion();
   
   
   public double coviertePesoColADolar(int valor) {
	   double resultado;
	   
	   resultado= valor/Double.parseDouble(valorMoneda);
	   
	   return resultado;
	   
   }
   
   public double covierteDolarAPesoCol(int valor) {
	   double resultado;
	   
	   resultado= valor*Double.parseDouble(valorMoneda);
	   
	   return resultado;
	   
   }
   
}
