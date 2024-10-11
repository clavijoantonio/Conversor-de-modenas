package Model;

public class PesoColombianoModel extends ModenasModel {
    
   String codigo= "COP";
   
   String codigoBase="USD";
   
   int valorAcovertir;
   
   ModenasModel modenaString= conversorMoneda(codigo, codigoBase);
   
   String valorMoneda= modenaString.getConversion();
   
   
   public int coviertePesoADolar(int valor) {
	   int resultado;
	   resultado= valor/Integer.parseInt(valorMoneda);
	   System.out.println(valorMoneda);
	   return resultado;
	   
   }
   
}
