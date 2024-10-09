package Principal;

import java.io.IOException;

import Controller.ConexionApiController;

public class CoversorModenasPricipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConexionApiController cone= new ConexionApiController();
		
		try {
			cone.conectaApi();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
