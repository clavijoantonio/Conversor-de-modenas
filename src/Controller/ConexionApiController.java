package Controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionApiController {
	public void conectaApi () throws IOException, InterruptedException {
	String clave = "";
    String direccion = "https://v6.exchangerate-api.com/v6/c1403bceb322ca041fc3f9c5/latest/USD";

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(direccion))
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
    
	}
}
