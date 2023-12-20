package RePac;

public class RePac {
/**
 * 
 * @author PedroR
 * 
 */
	public static void main(String[] args) {
		Modelo modelo = new Modelo();
		 
		   //La vista se inicia pero no se muestra (visible = false)
		   Vista vista = new Vista();
		 
		   //El controlador arranca 
		   Controlador controlador = new Controlador(vista,modelo, null);
		 
		   PantallaCarga splash = new PantallaCarga();
		 
		   //Cuando ha terminado la ejecucion del SplashScreen
		   // se muestra la ventana principal
	vista.setVisible(true);

	}

}
