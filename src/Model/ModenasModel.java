package Model;

import java.io.IOException;

import com.google.gson.annotations.SerializedName;

import Controller.ConexionApiController;

public class ModenasModel {
	
	private String codebase;
	
	
	private String targetCode;
	
	@SerializedName("conversion_rate")
	private String conversion;

	public String getCodebase() {
		return codebase;
	}

	public void setCodebase(String codebase) {
		this.codebase = codebase;
	}

	public String getTargetCode() {
		return targetCode;
	}

	public void setTargetCode(String targetCode) {
		this.targetCode = targetCode;
	}

	public String getConversion() {
		return conversion;
	}

	public void setConversion(String conversion) {
		this.conversion = conversion;
	}
	
	
    public ModenasModel conversorMoneda(String targetCode,String baseCode) {
     
    	ConexionApiController conex= new ConexionApiController();
       
    	ModenasModel result=null;
    	
		try {
			result = conex.conectaApi(targetCode, baseCode);
			
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return result;
    }
	
	
	
}
