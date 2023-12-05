package RePac;

import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

public class Controlador {
	 private JProgressBar barraProgreso;
	public Controlador(Vista vista, Modelo modelo,PantallaCarga carga) {
	}
		// TODO Auto-generated constructor stub
		   private void iniciarBarraCarga() throws InterruptedException {
			      for(int i = 0; i <= 100; i++){
			         Thread.sleep(20);
			         actualizarBarraProgreso(i);
			      }
			   }
			 
			   private void actualizarBarraProgreso(int valor) {
			      SwingUtilities.invokeLater(new Runnable() {
			         @Override
			         public void run() {
			        	
						barraProgreso.setValue(valor);
			         }
			      });
			}
		
	}

	


