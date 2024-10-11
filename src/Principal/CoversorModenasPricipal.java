package Principal;

import java.io.IOException;

import Controller.ConexionApiController;
import View.VistasView;

public class CoversorModenasPricipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		
		ConexionApiController conex= new ConexionApiController();
		
		
       VistasView vistas= new VistasView();
		
		vistas.presentarMenu();
		
	}

}
