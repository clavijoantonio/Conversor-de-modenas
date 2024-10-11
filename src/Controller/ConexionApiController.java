package Controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

import Model.ModenasModel;

public class ConexionApiController {
	
	public ModenasModel conectaApi (String targetCod,String baseCod) throws IOException, InterruptedException {
		String targetCode =targetCod;
		String baseCode=baseCod;
		
	    String direccion = "https://v6.exchangerate-api.com/v6/c1403bceb322ca041fc3f9c5/pair/"+baseCode+ "/"+ targetCode;
	   
	    HttpClient client = HttpClient.newHttpClient();
	    HttpRequest request = HttpRequest.newBuilder()
	            .uri(URI.create(direccion))
	            .build();
	    HttpResponse<String> response = client
	            .send(request, HttpResponse.BodyHandlers.ofString());
	    
	    String json=response.body();
	    
	    Gson gson = new Gson();
	    ModenasModel modena = gson.fromJson(json, ModenasModel.class);
	   
	    
	    return modena;
	    
	}
	
	
}


